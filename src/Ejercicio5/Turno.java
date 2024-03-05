package Ejercicio5;

import java.time.LocalTime;

public class Turno {
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private String descripcion;


    public Turno(LocalTime horaInicio, LocalTime horaFin, String descripcion) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.descripcion = descripcion;
    }


    public LocalTime getHoraInicio() {
        return horaInicio;
    }


    public LocalTime getHoraFin() {
        return horaFin;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    @Override
    public String toString() {
        return descripcion;
    }}


