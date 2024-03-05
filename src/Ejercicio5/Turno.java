package Ejercicio5;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

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

    public long getHorasTrabajadas() {
        return ChronoUnit.HOURS.between(horaInicio, horaFin);
    }

    public String getTipoTurno() {
        LocalTime medioDia = LocalTime.of(12, 0);
        if (horaInicio.isBefore(medioDia)) {
            return "Turno de día";
        } else {
            return "Turno de tarde";
        }
    }

    @Override
    public String toString() {
        return descripcion;
    }
}