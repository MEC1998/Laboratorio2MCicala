package EJERCICIO_1;

public class Vuelo extends Avion{
    private int numVuelo;

    public Vuelo(int cantPasajeros, int numAvion, int numVuelo) {
        super(cantPasajeros, numAvion);
        this.numVuelo = numVuelo;
    }

    public int getNumVuelo() {
        return numVuelo;
    }

    public void setNumVuelo(int numVuelo) {
        this.numVuelo = numVuelo;
    }
}
