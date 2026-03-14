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

        // Getters extendidos de Persona getNombre() y getEmail()
        System.out.println("Nombre del invitado: " + invitado1.getNombre());
        System.out.println("Email del invitado: " + invitado1.getEmail());

        // getTelefono() metodo propio de Guest
        System.out.println("Telefono del invitado: "+invitado1.getTelefono());

        // getRole() metodo abstracto
        System.out.println("Rol del invitado: " + invitado1.getRole());

        // setTelefono()
        invitado1.setTelefono("3113037402");
        System.out.println("Nuevo telefono del invitado: "+invitado1.getTelefono());

        // toString()
        System.out.println("\nPrint del Objeto Guest:");
        System.out.println(invitado1);

        // equals()
        System.out.println("\nComparacion Guests:");
        System.out.println("Invitado1 con Invitado2: "+invitado1.equals(invitado2));
        System.out.println("Invitado1 con Invitado3: "+invitado1.equals(invitado3) + " (tienen mismo id)");

        // Test Reserva Ejecutando Correctamente
        try
        {
            hotel.createReservation(1, 101, "2026-05-01", "2026-05-05");
            System.out.println("\nReserva creada correctamente");
        }
        catch (InvalidDateException e)
        {
            System.out.println("Error de fecha: " + e.getMessage());
        }
        catch (RoomUnavailableException e)
        {
            System.out.println("Error: " + e.getMessage());
        }

        // Test RoomUnavailableException FALTA QUE DEVUELVE LA EXCEPTION PQ TODAVIA FALTA MUCHO CODIGO EN ROOM. REVISAR LUEGO
        try
        {
            // misma habitacion y fechas que se cruzan
            hotel.createReservation(2, 101, "2026-05-03", "2026-05-06");
            System.out.println("Reserva creada correctamente");
        }
        catch (InvalidDateException e)
        {
            System.out.println("Error de fecha: " + e.getMessage());
        }
        catch (RoomUnavailableException e)
        {
            System.out.println("Error: " + e.getMessage());
        }

        // Test InvalidDateException
        try
        {
            // fecha final antes que la inicial (usuario bobo)
            hotel.createReservation(1, 102, "2026-05-10", "2026-05-05");
            System.out.println("Reserva creada correctamente");
        }
        catch (InvalidDateException e)
        {
            System.out.println("Error de fecha: " + e.getMessage());
        }
        catch (RoomUnavailableException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}