package Ejemplo8;

import java.util.ArrayList;

public class ProductDAO {
    private ArrayList<Product> products;

    ProductDAO(){
        products = new ArrayList<>();
    }
    void save(Product product){
        products.add(product);
    }

    Product get(int id){
        return products.stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElse(null);
    }

    ArrayList<Product> getAll(){
        return products;
    }

    void update(Product product){
        int index = products.indexOf(get(product.getId()));
        if (index != -1) {
            products.set(index, product);
        } else {
            throw new IllegalStateException("There is no product with the id:" + product.getId());
        }
    }

    void delete(int id){
        Product product = get(id);
        if (product != null) {
            products.remove(product);
        } else {
            throw new IllegalStateException("There is no product with the id:" + id);
        }
    }
}
