public abstract class Person
{
        protected int id;
        protected String nombre;
        protected String email;

        public int getId() {
            return id;
        }

        public String getNombre() {
            return nombre;
        }

        public String getEmail() {
            return email;
        }

        public void setNombre(String nombre) { this.nombre = nombre; }

        public void setEmail(String email) {
            this.email = email;
        }
        public abstract String getRole();

        // Creator: @Tomer
}

