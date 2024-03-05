//package Ejercicio6;
//
//public class shopDAO {
//    private String items;
//
//    public void addItem(Object item) {
//        items.add(item);
//    }
//
//    public void sellItem(Object item) {
//        if (items.contains((CharSequence) item)) {
//            items.remove(item);
//            totalSales += item instanceof Book ? ((Book) item).getPrice() : ((Movie) item).getPrice();
//        }
//    }
//
//    public void printItems() {
//        for (Object item : items) {
//            System.out.println(item.toString());
//        }
//    }
//
//    public float getTotalSales() {
//        return totalSales;
//    }
//
//
//    public void addToCart(Object item) {
//        if (items.contains(item)) {
//            cart.add(item);
//        }
//    }
//
//    public void checkout() {
//        for (Object item : cart) {
//            sellItem(item);
//        }
//        cart.clear();
//    }
//
//
//    public String getItems() {
//        return items;
//    }
//
//    public void setItems(String items) {
//        this.items = items;
//    }
//}
//