package Ejercicio1;

import javax.swing.JOptionPane;
import java.util.Date;
import java.text.SimpleDateFormat;

public class CompanyMain {
    public static void main(String[] args) throws Exception {
        EmpleadoDAO empleadoDAO = new EmpleadoDAO();


        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNacimiento = sdf.parse(JOptionPane.showInputDialog("Ingrese la fecha de nacimiento del empleado (dd/MM/yyyy):"));
        Date fechaIngreso = sdf.parse(JOptionPane.showInputDialog("Ingrese la fecha de ingreso del empleado (dd/MM/yyyy):"));
        double salarioBasico = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario básico del empleado:"));
        Empleado empleado = new Empleado("Juan", "Perez", "Masculino", fechaNacimiento, fechaIngreso, salarioBasico);


        empleadoDAO.saveEmpleado(empleado);


        String[] opciones = {"Visualizar información", "Modificar salario", "Calcular edad", "Calcular antigüedad", "Calcular prestaciones","Salir del programa"};
        while (true){
        int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        switch(opcion) {
            case 0:
                empleadoDAO.visualizarInformacion(empleado);
                break;
            case 1:
                double nuevoSalario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo salario del empleado:"));
                empleadoDAO.modificarSalario(empleado, nuevoSalario);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "La edad del empleado es: " + empleadoDAO.calcularEdad(empleado));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "La antigüedad del empleado es: " + empleadoDAO.calcularAntiguedad(empleado));
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Las prestaciones del empleado son: " + empleadoDAO.calcularPrestaciones(empleado));
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"Saliendo del programa");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opcion no valida");
        }
        }
}}
