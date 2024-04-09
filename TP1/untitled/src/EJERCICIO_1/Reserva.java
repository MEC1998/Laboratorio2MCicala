package EJERCICIO_1;

public class Reserva extends Vuelo{

    private int numReserva;

    public Reserva(int cantPasajeros, int numAvion, int numVuelo, int numReserva) {
        super(cantPasajeros, numAvion, numVuelo);
        this.numReserva = numReserva;
    }

    public int getNumReserva() {
        return numReserva;
    }

    public void setNumReserva(int numReserva) {
        this.numReserva = numReserva;
    }
}
