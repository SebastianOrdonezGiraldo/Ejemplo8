package Ejercicio5;

import java.time.LocalTime;
import javax.swing.JOptionPane;

public class TurnoMain {
    public static void main(String[] args) {

        String horaInicioInput = JOptionPane.showInputDialog("Enter the start time (HH:mm):");
        LocalTime horaInicio = LocalTime.parse(horaInicioInput);
        String horaFinInput = JOptionPane.showInputDialog("Enter the end time (HH:mm):");
        LocalTime horaFin = LocalTime.parse(horaFinInput);
        Turno turnoEjemplo = new Turno(horaInicio, horaFin, "Day shift");
        JOptionPane.showMessageDialog(null,
                "Shift start time: " + turnoEjemplo.getHoraInicio() +
                        "\nEnd of shift time: " + turnoEjemplo.getHoraFin() +
                        "\nTotal hours worked: " + turnoEjemplo.getHorasTrabajadas() +
                        "\nShift Type: " + turnoEjemplo.getTipoTurno() +
                        "\nShift Description: " + turnoEjemplo.toString(),
                "Shift Information", JOptionPane.INFORMATION_MESSAGE);
    }
}