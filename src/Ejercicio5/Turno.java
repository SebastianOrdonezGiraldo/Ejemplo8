package Ejercicio5;

public class Turno {
    private double starTime;
    private double endTime;
    private String description;

    public Turno(double starTime, double endTime, String description) {
        this.starTime = starTime;
        this.endTime = endTime;
        this.description = description;
    }

    public double getStarTime() {
        return starTime;
    }

    public void setStarTime(double starTime) {
        this.starTime = starTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
