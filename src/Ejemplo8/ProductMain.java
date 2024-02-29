package Ejemplo8;

import javax.swing.*;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        ProductDAO dao = new ProductDAO();
        Scanner scanner = new Scanner(System.in);

        String[] options = {"Add product", "Show all products", "Show product", "Update product", "Delete product", "Exit"};
        while (true){
            int seleccion = JOptionPane.showOptionDialog(null,"Select an option: ","Inventory manager",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE, null,options,options[0]);

            switch (seleccion){
                case 0: //Add
                    String idString = JOptionPane.showInputDialog(null,"Id: ");
                    int id = Integer.parseInt(idString);
                    String name = JOptionPane.showInputDialog(null,"Product name: ");
                    String priceString = JOptionPane.showInputDialog(null,"Price: ");
                    int price = Integer.parseInt(priceString);

                    Product productToAdd = new Product(id,name,price);
                    dao.save(productToAdd);
                    JOptionPane.showMessageDialog(null,"Product successfully added");
                    break;
                case 1: //Show all
                    // Obtiene todos los productos del DAO (Data Access Object)
                    ArrayList<Product> allProducts = dao.getAll();
                    if (allProducts.isEmpty()) { // Verifica si la lista de productos está vacía
                        JOptionPane.showMessageDialog(null, "There are no products available");
                    } else {
                        StringBuilder allProductsDetails = new StringBuilder();//
                        for (Product product : allProducts) {
                            allProductsDetails.append("Product Details:\nId: ").append(product.getId()).append("\nName: ").append(product.getName()).append("\nPrice: $ ").append(product.getPrice()).append("\n\n");
                        } // agregar texto o la representación de cadena de un objeto al final de una cadena representada por el objeto StringBuilder actual
                        JOptionPane.showMessageDialog(null, allProductsDetails.toString());
                    }
                    break;
                case 2: //Show
                    String productIdString = JOptionPane.showInputDialog(null,"Enter the product Id: ");
                    int id1 = Integer.parseInt(productIdString);
                    try {
                        Product productToShow = dao.get(id1);
                        if (productToShow == null) {
                            JOptionPane.showMessageDialog(null, "The product does not exist");
                        } else {
                            JOptionPane.showMessageDialog(null,"Product Details:\nId: " + productToShow.getId() + "\nName: " + productToShow.getName() + "\nPrice: $ " + productToShow.getPrice());
                        }
                    } catch (IllegalArgumentException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                    break;
                case 3: //Update
                    String productUpdateId = JOptionPane.showInputDialog(null,"Id of the product you want to update:");
                    int id2 = Integer.parseInt(productUpdateId);
                    Product currentProduct = dao.get(id2);

                    // Verifica si el producto existe
                    if (currentProduct == null) {
                        JOptionPane.showMessageDialog(null,"The product does not exist");
                    } else {
                        String name2 = JOptionPane.showInputDialog(null,"Current name: " + currentProduct.getName());
                        String newName = JOptionPane.showInputDialog(null,"Enter the new name");

                        String actualPrice = JOptionPane.showInputDialog(null,"Current price: " + currentProduct.getPrice());
                        int price1 = Integer.parseInt(actualPrice);     //double price1 = Double.parseDouble(actualPrice);
                        String newPrice = JOptionPane.showInputDialog(null,"New price: ");
                        int price2 = Integer.parseInt(newPrice);//double price2 = Double.parseDouble(newPrice);
                        currentProduct.setName(newName);
                        currentProduct.setPrice(price2);
                        dao.update(currentProduct);
                        JOptionPane.showMessageDialog(null,"Updated product");
                    }
                    break;


                case 4://delete
                    String productDelete = JOptionPane.showInputDialog(null,"Id of the product you want to delete:");
                    int id3 = Integer.parseInt(productDelete);
                    Product productToDelete = dao.get(id3);
                    if (productToDelete == null) {
                        JOptionPane.showMessageDialog(null, "The product does not exist");
                    } else {
                        dao.delete(id3);
                        JOptionPane.showMessageDialog(null,"Product with Id: " + productToDelete.getId() + " has been deleted");
                    }
                    break;

                case 5://Exit
                JOptionPane.showMessageDialog(null,"Exiting the program");
                break;

                default:
                    JOptionPane.showMessageDialog(null,"Invalid option");
            }
        }
    }
}
