public interface Reservable
{
    boolean isAvailable(Reservation[] reservas, String fechaInicio, String fechaFin);
}