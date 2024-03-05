package Ejercicio2;

public class Persona {
    private String cc,name,address;

    public Persona(String cc, String name, String address) {
        this.cc = cc;
        this.name = name;
        this.address = address;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}