public class Hotel
{
    private Room[] habitaciones;
    private Guest[] invitados;
    private Reservation[] reservas;

    private int cantidadHabitaciones;
    private int cantidadInvitados;
    private int cantidadReservas;

    // Inicializa el sistema del hotel creando arrays vacias donde se almacenarán habitaciones, invitados y reservas
    public Hotel(int capacidadHabitaciones, int capacidadInvitados, int capacidadReservas) {

        habitaciones = new Room[capacidadHabitaciones];
        invitados = new Guest[capacidadInvitados];
        reservas = new Reservation[capacidadReservas];

        // Inicializa contadores en 0 porque el sistema no contiene datos
        cantidadHabitaciones = 0;
        cantidadInvitados = 0;
        cantidadReservas = 0;
    }

    // Metodos Invitados

    public void addGuest(Guest invitado) {
        if (cantidadInvitados == invitados.length)
        {
            resizeGuestsArray(); // si se llena el array agrandalo
        }
        invitados[cantidadInvitados] = invitado; // guarda invitado en la primera posicion libre del array
        cantidadInvitados++;
    }

    public Guest findGuest(int id) {
        for (int i = 0; i < cantidadInvitados; i++) {
            if (invitados[i].getId() == id) {
                return invitados[i];
            }
        }
        return null;
    }

    // Metodos Habitaciones

    public void addRoom(Room habitacion) {
        if (cantidadHabitaciones == habitaciones.length) {
            resizeRoomsArray();
        }
        habitaciones[cantidadHabitaciones] = habitacion; // guardala en el primer espacio libre del array
        cantidadHabitaciones++;
    }

    public Room findRoom(int numeroHabitacion) {
        for (int i = 0; i < cantidadHabitaciones; i++) {
            if (habitaciones[i].getRoomNumber() == numeroHabitacion) {
                return habitaciones[i];
            }
        }
        return null;
    }

    // incluir explicacion en presentacion
    public void removeRoom(int numeroHabitacion) {
        for (int i = 0; i < cantidadHabitaciones; i++) {

            if (habitaciones[i].getRoomNumber() == numeroHabitacion) {

                for (int j = i; j < cantidadHabitaciones - 1; j++) {
                    habitaciones[j] = habitaciones[j + 1];
                }

                habitaciones[cantidadHabitaciones - 1] = null;
                cantidadHabitaciones--;

                return;
            }
        }
    }

    // Metodos Reservas

    public void createReservation(int idInvitado, int numeroHabitacion, String fechaInicio, String fechaFin) throws InvalidDateException, RoomUnavailableException, GuestNotFoundException, RoomNotFoundException {

        if (!Date_Utils.isValidDate(fechaInicio) || !Date_Utils.isValidDate(fechaFin)) {
            throw new InvalidDateException("Fecha invalida");
        }

        if (!Date_Utils.isStartBeforeEnd(fechaInicio, fechaFin)) {
            throw new InvalidDateException("La fecha inicial debe ser antes de la final");
        }

        Guest invitado = findGuest(idInvitado); // Busca al invitado dentro de Hotel (izq) y lo guarda, usando el id del invitado para crear la reserva
        if (invitado == null) {
            throw new GuestNotFoundException("No se encontró invitado con ID: " + idInvitado);
        }

        Room habitacion = findRoom(numeroHabitacion);   // Verifica si habitacion esta disponible en la fecha elegida (izq) y la guarda, usa el # de habitacion para crear reserva
        if (habitacion == null) {
            throw new RoomNotFoundException("No se encontró habitación número: " + numeroHabitacion);
        }

        if (invitado == null || habitacion == null) {
            return;
        }

        if (!habitacion.isAvailable(reservas, fechaInicio, fechaFin)) {
            throw new RoomUnavailableException("La habitacion no esta disponible");
        }

        if (cantidadReservas == reservas.length) {
            resizeReservationsArray();
        }

        int nuevoId = cantidadReservas + 1; // le asigna un nuevo id a la reserva, la crea, ingresa en el array de reservas y la cuenta en el sistema.
        Reservation reservaNueva = new Reservation(nuevoId, invitado, habitacion, fechaInicio, fechaFin);
        reservas[cantidadReservas] = reservaNueva;
        cantidadReservas++;
    }

    public void cancelReservation(int idReserva) {
        for (int i = 0; i < cantidadReservas; i++) {

            if (reservas[i].getReservationId() == idReserva) {

                reservas[i].cancelReservation();
                return;

            }

        }
    }

    // --------- RESIZE ARRAYS ---------

    // se crea otro array nuevo mas grande si se quiere agrandar (x2 para no quemar tanta memoria)
    private void resizeRoomsArray() {
        Room[] nuevasHabitaciones = new Room[habitaciones.length * 2];

        //for copia la info
        for (int i = 0; i < habitaciones.length; i++) {
            nuevasHabitaciones[i] = habitaciones[i]; // reemplaza el pequeño por el grande
        }

        habitaciones = nuevasHabitaciones; // sobreescribe el nombre de la var temporal y lo pone igual al nombre de la var original (evita calling issues)
    }

    private void resizeGuestsArray() {
        Guest[] nuevosInvitados = new Guest[invitados.length * 2];

        for (int i = 0; i < invitados.length; i++) {
            nuevosInvitados[i] = invitados[i];
        }

        invitados = nuevosInvitados;
    }

    private void resizeReservationsArray() {
        Reservation[] nuevasReservas = new Reservation[reservas.length * 2];

        for (int i = 0; i < reservas.length; i++) {
            nuevasReservas[i] = reservas[i];
        }

        reservas = nuevasReservas;
    }
    // Creator: @Simon
}