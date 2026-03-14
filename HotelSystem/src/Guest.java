public class Guest extends Person
{
    private String telefono;

    public Guest(int id, String nombre, String email, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Incluir en presentacion
    // Sobrescribimos equals() para que compare Guests usando su id verificando si es el mismo objeto en memoria, luego verificamos que el objeto sea de tipo Guest y finalmente comparamos los ids. Si los ids son iguales, es el mismo invitado.
    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        // class Object method getClass() -- para identificar la clase del objeto en cuestion
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Guest otro = (Guest) o;

        return this.id == otro.id;
    }

    // Imprime cada objeto de Guest
    @Override
    public String toString() {
        return "Guest id: " + id +
                " nombre: " + nombre +
                " email: " + email +
                " telefono: " + telefono;
    }

    // Como reescribimos un equals() tambien sobreescribimos el hash por regla del proyecto
    @Override
    public int hashCode()
    {
        return id;
    }

    // Reutilizamos el abstract method de Persona
    @Override
    public String getRole(){
        return "Guest";
    }

    // Creator: @Simon
}