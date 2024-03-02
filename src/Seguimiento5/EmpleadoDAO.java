package Seguimiento5;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class EmpleadoDAO {
    private ArrayList<Empleado> empleados;

    EmpleadoDAO(){
        empleados = new ArrayList<>();
    }

    public void saveEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public void visualizarInformacion(Empleado empleado) {
        String info = "Nombre: " + empleado.getNombre() + "\n"
                + "Apellido: " + empleado.getApellido() + "\n"
                + "Genero: " + empleado.getGenero() + "\n"
                + "Fecha de Nacimiento: " + empleado.getFechaNacimiento() + "\n"
                + "Fecha de Ingreso: " + empleado.getFechaIngreso() + "\n"
                + "Salario Basico: " + empleado.getSalarioBasico();
        JOptionPane.showMessageDialog(null, info);
    }

    public void modificarSalario(Empleado empleado, double nuevoSalario) {
        empleado.setSalarioBasico(nuevoSalario);
    }

    public int calcularEdad(Empleado empleado) {
        LocalDate ahora = LocalDate.now();
        Date fechaNacimiento = empleado.getFechaNacimiento();
        LocalDate fechaNac = fechaNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return Period.between(fechaNac, ahora).getYears();
    }

    public int calcularAntiguedad(Empleado empleado) {
        LocalDate ahora = LocalDate.now();
        Date fechaIngreso = empleado.getFechaIngreso();
        LocalDate fechaIng = fechaIngreso.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return Period.between(fechaIng, ahora).getYears();
    }

    public double calcularPrestaciones(Empleado empleado) {
        int antiguedad = calcularAntiguedad(empleado);
        double salarioBasico = empleado.getSalarioBasico();
        return (antiguedad * salarioBasico) / 12;
    }
}

