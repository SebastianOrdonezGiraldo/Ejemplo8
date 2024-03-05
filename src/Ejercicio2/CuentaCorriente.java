package Ejercicio2;

public class CuentaCorriente {
    private String numbreCorriente;
    private double saldo;

    public CuentaCorriente(String numbreCorriente, double saldo) {
        this.numbreCorriente = numbreCorriente;
        this.saldo = saldo;
    }

    public String getNumbreCorriente() {
        return numbreCorriente;
    }

    public void setNumbreCorriente(String numbreCorriente) {
        this.numbreCorriente = numbreCorriente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}