public class Reservation
{
    private int reservationId;
    private Room habitacion;

    public Reservation(int id, Guest invitado, Room habitacion, String inicio, String fin)
    {
        this.reservationId = id;
        this.habitacion = habitacion;
    }

    public int getReservationId()
    {
        return reservationId;
    }

    public Room getRoom()
    {
        return habitacion;
    }

    public void cancelReservation()
    {

    }

    public boolean conflictsWith(String inicio, String fin)
    {
        return false;
    }
}