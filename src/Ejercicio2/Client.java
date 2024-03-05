package Ejercicio2;

public class Client {

    private Persona persona;
    private CuentaAhorro cuentaAhorro;
    private CuentaCorriente cuentaCorriente;
    private CuentaCDT cuentaCDT;

    public Client(Persona persona, CuentaAhorro cuentaAhorro, CuentaCorriente cuentaCorriente, CuentaCDT cuentaCDT) {
        this.persona = persona;
        this.cuentaAhorro = cuentaAhorro;
        this.cuentaCorriente = cuentaCorriente;
        this.cuentaCDT = cuentaCDT;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public CuentaAhorro getCuentaAhorro() {
        return cuentaAhorro;
    }

    public void setCuentaAhorro(CuentaAhorro cuentaAhorro) {
        this.cuentaAhorro = cuentaAhorro;
    }

    public CuentaCorriente getCuentaCorriente() {
        return cuentaCorriente;
    }

    public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }

    public CuentaCDT getCuentaCDT() {
        return cuentaCDT;
    }

    public void setCuentaCDT(CuentaCDT cuentaCDT) {
        this.cuentaCDT = cuentaCDT;
    }
}