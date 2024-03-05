package Ejercicio2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        ProcesoDAO procesoDAO = new ProcesoDAO();
        String[] opciones = {"View balances", "Deposit Savings Account", "Withdraw Savings Account", "Deposit Checking Account", "Withdraw Checking Account", "Invest in CDT", "Close CDT", "Exit"};
        boolean flag = true;
        do{
            int options = JOptionPane.showOptionDialog(null, "Select an option", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
            switch (options){
                case 0:
                    procesoDAO.verSaldo();
                    break;
                case 1:
                    procesoDAO.ingresoAhorros();
                    break;
                case 2:
                    procesoDAO.retiroAhorros();
                    break;
                case 3:
                    procesoDAO.ingresoCorriente();
                    break;
                case 4:
                    procesoDAO.retiroCorriente();
                    break;
                case 5:
                    procesoDAO.ingresoCDT();
                    break;
                case 6:
                    procesoDAO.cerrarCDT();
                    break;
                case 7:
                    flag = false;
                    break;
            }
        }while (flag);
    }
}
