public class Date_Utils
{
    public static boolean isValidDate(String fecha)
    {
        return fecha != null && fecha.matches("\\d{4}-\\d{2}-\\d{2}");
    }

    public static boolean isStartBeforeEnd(String inicio, String fin)
    {
        return inicio.compareTo(fin) < 0;
    }
}
