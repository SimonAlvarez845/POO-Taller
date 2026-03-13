public class Main {

    public static void main(String[] args) {

        // Espacio de pruebas de código, prob lo deleteemos al final

        // ----------PRUEBAS CLASE GUEST Y PERSON----------

        // Creacion de objeto Guests
        Guest invitado1 = new Guest(1, "Simon", "simon@email.com", "3001234567");
        Guest invitado2 = new Guest(2, "Juan Pablo", "jpablo@email.com", "3019876543");
        Guest invitado3 = new Guest(1, "Ana", "ana@email.com", "3001234567");

        // Getters extendidos de Persona getNombre() y getEmail()
        System.out.println("Nombre del invitado: " + invitado1.getNombre());
        System.out.println("Email del invitado: " + invitado1.getEmail());

        // Getter del metodo propio de Guest
        System.out.println("Telefono del invitado: "+invitado1.getTelefono());

        // getRole() metodo abstracto
        System.out.println("Rol del invitado: " + invitado1.getRole());

        // Setter setTelefono()
        invitado1.setTelefono("3111111111");
        System.out.println("Nuevo telefono del invitado: "+invitado1.getTelefono());

        // toString()
        System.out.println("\nPrint del Objeto Guest:");
        System.out.println(invitado1);

        // equalsGuest()
        System.out.println("\nComparacion Guests:");
        System.out.println("Invitado1 con Invitado2: "+invitado1.equalsGuest(invitado2));
        System.out.println("Invitado1 con Invitado3: "+invitado1.equalsGuest(invitado3));

        // ----------PRUEBAS CLASE GUEST----------


    }
}