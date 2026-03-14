public class Main {
    public static void main(String[] args)
    {
        // Espacio de pruebas de código, probablemente lo deleteemos al final

        // Creacion de objeto Hotel
        Hotel hotel = new Hotel(10, 10, 10);

        // Creacion de objeto Guest
        Guest invitado1 = new Guest(1, "Simon", "simon@email.com", "3001234567");
        Guest invitado2 = new Guest(2, "Juan Pablo", "jpablo@email.com", "3019876543");
        Guest invitado3 = new Guest(1, "Ana", "ana@email.com", "3001234567");

        // Creacion de Guest en Hotel
        hotel.addGuest(invitado1);
        hotel.addGuest(invitado2);

        // Creacion de Room
        Room habitacion101 = new Room(101, "Simple", 100);
        Room habitacion102 = new Room(102, "Doble", 150);

        // Creacion de Room en Hotel
        hotel.addRoom(habitacion101);
        hotel.addRoom(habitacion102);

        System.out.println("\nGETTERS & SETTERS DE PERSONA & GUEST:");
        // Getters extendidos de Persona getNombre() y getEmail()
        System.out.println("Nombre del invitado: " + invitado1.getNombre());
        System.out.println("Email del invitado: " + invitado1.getEmail());

        // getTelefono() metodo propio de Guest
        System.out.println("Telefono del invitado: "+invitado1.getTelefono());

        // getRole() metodo abstracto
        System.out.println("\nABSTRACT METHOD:");
        System.out.println("Rol del invitado: " + invitado1.getRole());

        // setTelefono()
        invitado1.setTelefono("3113037402");
        System.out.println("Nuevo telefono del invitado: "+invitado1.getTelefono());

        // toString()
        System.out.println("\nPRINT DEL OBJETO GUEST:");
        System.out.println(invitado1);

        // equals()
        System.out.println("\nEQUALS ENTRE GUESTS:");
        System.out.println("Invitado1 con Invitado2: "+invitado1.equals(invitado2));
        System.out.println("Invitado1 con Invitado3: "+invitado1.equals(invitado3) + " (tienen mismo id)");

        System.out.println("\nMANEJO DE ERRORES:");
        // Test InvalidDateException
        try
        {
            hotel.createReservation(1, 101, "fecha-mal-ingresada", "2025-12-20");
            System.out.println("Error");
        }
        catch (InvalidDateException e)
        {
            System.out.println("[FECHAS] La fecha ingresada no tiene el formato correcto: " + e.getMessage());
        }
        catch (GuestNotFoundException | RoomNotFoundException | RoomUnavailableException e)
        {
            System.out.println("Error inesperado: " + e.getMessage());
        }

        // Test InvalidDateException (Case 2) fecha inicio antes que fin (usuario bobo)
        try
        {
            hotel.createReservation(1, 101, "2025-12-20", "2025-12-10");
            System.out.println("Error");
        }
        catch (InvalidDateException e)
        {
            System.out.println("[FECHAS] El check-in no puede ser despues del check-out: " + e.getMessage());
        }
        catch (GuestNotFoundException | RoomNotFoundException | RoomUnavailableException e)
        {
            System.out.println("Error inesperado: " + e.getMessage());
        }

        // Test GuestNotFoundException
        try
        {
            hotel.createReservation(999, 101, "2025-12-01", "2025-12-05");
            System.out.println("Error");
        }
        catch (GuestNotFoundException e)
        {
            System.out.println("[INVITADO] No encontramos a nadie registrado con ese ID: " + e.getMessage());
        }
        catch (InvalidDateException | RoomNotFoundException | RoomUnavailableException e)
        {
            System.out.println("Error inesperado: " + e.getMessage());
        }

        // Test RoomNotFoundException
        try
        {
            hotel.createReservation(1, 999, "2025-12-01", "2025-12-05");
            System.out.println("ERROR: debería haber lanzado excepción");
        }
        catch (RoomNotFoundException e)
        {
            System.out.println("[HABITACION] Ese numero de habitacion no existe en el sistema: " + e.getMessage());
        }
        catch (InvalidDateException | GuestNotFoundException | RoomUnavailableException e)
        {
            System.out.println("Error inesperado: " + e.getMessage());
        }

        // Test RoomUnavailableException OJO ESTO DA ERROR PQ NO TIENE LOGICA DE MANEJO ESO VA EN RESERVATION
        try
        {
            hotel.createReservation(1, 101, "2025-12-01", "2025-12-05");
            hotel.createReservation(1, 101, "2025-12-03", "2025-12-07");
            System.out.println("Error");
        }
        catch (RoomUnavailableException e)
        {
            System.out.println("La habitacion ya esta reservada en esas fechas: " + e.getMessage());
        }
        catch (InvalidDateException | GuestNotFoundException | RoomNotFoundException e)
        {
            System.out.println("Error inesperado: " + e.getMessage());
        }

        // createReservation() funcionando normalmente
        try
        {
            hotel.createReservation(1, 101, "2025-12-10", "2025-12-15");
            System.out.println("[NO ERRORS] Reserva creada correctamente.");
        }
        catch (InvalidDateException | GuestNotFoundException | RoomNotFoundException | RoomUnavailableException e)
        {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }
}