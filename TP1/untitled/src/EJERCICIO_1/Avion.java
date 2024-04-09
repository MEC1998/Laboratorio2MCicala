package EJERCICIO_1;

public class Avion {

    private int cantPasajeros;
    private int numAvion;

    public Avion(int cantPasajeros, int numAvion) {
        this.cantPasajeros = cantPasajeros;
        this.numAvion = numAvion;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public int getNumAvion() {
        return numAvion;
    }

    public void setNumAvion(int numAvion) {
        this.numAvion = numAvion;
    }
}
