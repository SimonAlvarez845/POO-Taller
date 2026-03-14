public class Room implements Reservable
{
    private int roomNumber;
    private String tipo;
    private double precio;

    public Room(int roomNumber, String tipo, double precio)
    {
        this.roomNumber = roomNumber;
        this.tipo = tipo;
        this.precio = precio;
    }

    public int getRoomNumber()
    {
        return roomNumber;
    }

    @Override
    public boolean isAvailable(Reservation[] reservas, String fechaInicio, String fechaFin)
    {
        for(int i = 0; i < reservas.length; i++)
        {
            Reservation r = reservas[i];

            if(r != null && r.getRoom().getRoomNumber() == this.roomNumber)
            {
                if(r.conflictsWith(fechaInicio, fechaFin))
                {
                    return false;
                }
            }
        }
        return true;
    }
}