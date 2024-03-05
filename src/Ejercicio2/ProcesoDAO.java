package Ejercicio2;

import javax.swing.*;

public class ProcesoDAO {
    Persona persona = new Persona("1005133059","Luis Cohecha","Bioma");
    CuentaAhorro cuentaAhorro = new CuentaAhorro("2384-7012-8408",1000000,0.6f);
    CuentaCorriente cuentaCorriente = new CuentaCorriente("1235-2472-8482",5000000);
    CuentaCDT cuentaCDT = new CuentaCDT();
    Client cliente = new Client(persona,cuentaAhorro,cuentaCorriente,cuentaCDT);

    public void verSaldo(){
        String[] opciones = {"Ahorro","Corriente","CDT","Salir"};
        boolean flag = true;
        do {
            int options = JOptionPane.showOptionDialog(null, "Saldo total de las cuentas: "+(cuentaAhorro.getSaldo()+cuentaCorriente.getSaldo()+cuentaCDT.getSaldoCDT())+
                    "\nSeleccione una opción:", "Ver saldo de la cuenta", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
            switch (options){
                case 0:
                    JOptionPane.showMessageDialog(null,"Cuenta Ahorros\nSaldo: "+cuentaAhorro.getSaldo());
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null,"Cuenta Corriente\nSaldo: "+cuentaCorriente.getSaldo());
                    break;
                case 2:
                    if (cuentaCDT.getSaldoCDT() == 0){
                        JOptionPane.showMessageDialog(null,"Cuenta CDT\nSaldo: No hay CDT");
                        break;
                    }else {
                        JOptionPane.showMessageDialog(null,"Cuenta CDT\nSaldo: "+cuentaCDT.getSaldoCDT());
                        break;
                    }
                case 3:
                    flag = false;
                    break;
            }
        }while (flag);
    }
    public void ingresoAhorros() {
        boolean flag = true;
        double consigna;
        do {
            consigna = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto"));
            if (consigna > 0) {
                flag = false;
            }
        } while (flag);
        cuentaAhorro.setSaldo(cuentaAhorro.getSaldo() + consigna);
        System.out.println("Nuevo saldo de cuenta:"+cuentaAhorro.getSaldo());
    }
    public void ingresoCorriente() {
        boolean flag = true;
        double consigna;
        do {
            consigna = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto"));
            if (consigna > 0) {
                flag = false;
            }
        } while (flag);
        cuentaCorriente.setSaldo(cuentaCorriente.getSaldo() + consigna);
        System.out.println("Nuevo saldo de cuenta:"+cuentaCorriente.getSaldo());
    }
    public void retiroCorriente(){
        boolean flag = true;
        double retiro;
        do {
            retiro = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto a retirar"));
            if (retiro > 0 && retiro <= cuentaAhorro.getSaldo()) {
                flag = false;
            }
        } while (flag);
        cuentaAhorro.setSaldo(cuentaAhorro.getSaldo() - retiro);
        System.out.println("Nuevo saldo de cuenta:"+cuentaAhorro.getSaldo());
    }
    public void retiroAhorros(){
        boolean flag = true;
        double retiro;
        do {
            retiro = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto a retirar"));
            if (retiro > 0 && retiro <= cuentaCorriente.getSaldo()) {
                flag = false;
            }
        } while (flag);
        cuentaAhorro.setSaldo(cuentaCorriente.getSaldo() - retiro);
        System.out.println("Nuevo saldo de cuenta:"+cuentaCorriente.getSaldo());
    }
    public void ingresoCDT(){
        int seteCDT = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el saldo para el CDT"));
        cuentaCDT.setSaldoCDT(seteCDT);
        String[] opciones = {"30 Dias","60 Dias","90 Dias"};
        boolean flag = true;
        do{
            int options = JOptionPane.showOptionDialog(null, "Seleccione una opción:",
                    "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
            switch (options){
                case 0:
                    cuentaCDT.setTiempoCDT(30);
                    flag = false;
                    break;
                case 1:
                    cuentaCDT.setTiempoCDT(60);
                    flag = false;
                    break;
                case 2:
                    cuentaCDT.setTiempoCDT(90);
                    flag = false;
                    break;
            }
        }while (flag);
        if (cuentaCDT.getSaldoCDT() <= 1000000){
            cuentaCDT.setInteresCDT(0.6f);
        } else if (cuentaCDT.getSaldoCDT() > 1000000 && cuentaCDT.getSaldoCDT()<=5000000) {
            cuentaCDT.setInteresCDT(0.4f);
        }else{
            cuentaCDT.setInteresCDT(0.3f);
        }
        System.out.println("Saldo CDT: "+cuentaCDT.getSaldoCDT());
        System.out.println("Dias: "+cuentaCDT.getTiempoCDT());
        System.out.println("Intereses: "+cuentaCDT.getInteresCDT());
    }
    public void cerrarCDT(){
        cuentaCDT.setSaldoCDT(0);
        cuentaCDT.setTiempoCDT(0);
        cuentaCDT.setInteresCDT(0);
        JOptionPane.showMessageDialog(null, "Se ha cerrado el CDT");
    }
}