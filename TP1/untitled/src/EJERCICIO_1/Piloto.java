package EJERCICIO_1;

public class Piloto extends Persona{
    private int numLicencia;

    public Piloto(String nombre, String apellido, String dni, int numLicencia) {
        super(nombre, apellido, dni);
        this.numLicencia = numLicencia;
    }

    public int getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia(int numLicencia) {
        this.numLicencia = numLicencia;
    }
}
