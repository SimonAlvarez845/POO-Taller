public class Date_Utils
{
    // Verifica que la fecha tenga formato YYYY-MM-DD usando una expresion regular (regex)
    public static boolean isValidDate(String fecha)
    {
        return fecha != null && fecha.matches("\\d{4}-\\d{2}-\\d{2}"); // .matches es de la clase String. Verifica que la cadena contenga el formato correcto de una fecha
    }

    // Compara dos fechas (solo funciona en formato regex) para verificar que la de inicio sea antes que la de fin
    public static boolean isStartBeforeEnd(String inicio, String fin)
    {
        return inicio.compareTo(fin) < 0; // .compareTo tmb de la clase String.  Verifica si una fecha inicio es anterior a su fecha fin
    }
}
