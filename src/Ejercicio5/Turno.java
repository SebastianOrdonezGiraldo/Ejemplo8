package Ejercicio5;

import java.time.LocalTime;

public class Turno {
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private String descripcion;

    // Constructor
    public Turno(LocalTime horaInicio, LocalTime horaFin, String descripcion) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.descripcion = descripcion;
    }

    // Getter para horaInicio
    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    // Getter para horaFin
    public LocalTime getHoraFin() {
        return horaFin;
    }

    // Setter para descripcion
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Método toString para devolver la descripción
    @Override
    public String toString() {
        return descripcion;
    }}


