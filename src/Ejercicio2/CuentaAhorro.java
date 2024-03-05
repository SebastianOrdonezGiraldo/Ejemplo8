package Ejercicio2;

public class CuentaAhorro {
    private String numbreAhorros;
    private double saldo;
    private float interes;

    public CuentaAhorro(String numbreAhorros, double saldo, float interes) {
        this.numbreAhorros = numbreAhorros;
        this.saldo = saldo;
        this.interes = interes;
    }

    public String getNumbreAhorros() {
        return numbreAhorros;
    }

    public void setNumbreAhorros(String numbreAhorros) {
        this.numbreAhorros = numbreAhorros;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }
}
