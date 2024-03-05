package Ejercicio2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        ProcesoDAO procesoDAO = new ProcesoDAO();
        String[] opciones = {"Ver saldos","Consignar Cuenta Ahorros","Retirar Cuenta Ahorros","Consignar Cuenta Corriente","Retirar Cuenta Corriente","Invertir en CDT","Cerrar CDT","Salir"};
        boolean flag = true;
        do{
            int options = JOptionPane.showOptionDialog(null, "Seleccione la opcion", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
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
