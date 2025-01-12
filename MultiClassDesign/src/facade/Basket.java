package facade;

import java.util.ArrayList;
import java.util.List;

class Basket {

    private final List<Product> products = new ArrayList<>();
    double discount = 0;


    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double getTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotalWithDiscount() {
        return getTotal() * (1d - discount);
    }
}
