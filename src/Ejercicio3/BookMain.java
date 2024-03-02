package Ejercicio3;

import javax.swing.*;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("El principito","Antoine de Saint-Exupéry",96);
        JOptionPane.showMessageDialog(null,"Info of the book: "+ "\n" + book.obtenerInfo());
    }
}
