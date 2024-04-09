import EJERCICIO_1.Reserva;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Reserva reserva_1 = new Reserva(4, 666, 420, 1);

        JOptionPane.showMessageDialog(null, "Reserva exitosa\nNúmero de reserva: "+reserva_1.getNumReserva()+"\nCantidad de pasajeros: "+reserva_1.getCantPasajeros()+"\nAvión número: "+reserva_1.getNumAvion()+"\nNúmero de Vuelo: "+reserva_1.getNumVuelo());
    }
}