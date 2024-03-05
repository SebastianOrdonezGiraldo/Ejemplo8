package Ejercicio6;

import java.util.ArrayList;

public class ShopMain {
    private ArrayList<Object> items = new ArrayList<>();
    private ArrayList<Object> cart = new ArrayList<>();
    private float totalSales = 0;

    public void addItem(Object item) {
        items.add(item);
    }

    public void sellItem(Object item) {
        if (items.contains(item)) {
            items.remove(item);
            totalSales += item instanceof Book ? ((Book) item).getPrice() : ((Movie) item).getPrice();
        }
    }

    public void printItems() {
        for (Object item : items) {
            System.out.println(item.toString());
        }
    }

    public float getTotalSales() {
        return totalSales;
    }


    public void addToCart(Object item) {
        if (items.contains(item)) {
            cart.add(item);
        }
    }

    public void checkout() {
        for (Object item : cart) {
            sellItem(item);
        }
        cart.clear();
    }
}

