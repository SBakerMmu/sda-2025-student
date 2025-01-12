package mediator;

import java.util.ArrayList;
import java.util.List;

class Basket implements Colleague {

    private final List<Product> products = new ArrayList<>();
    private final Mediator mediator;
    double discount = 0;

    public Basket(Mediator mediator) {
        this.mediator = mediator;
    }

    public void addProduct(Product product) {
        products.add(product);
        mediator.onChanged(this);
    }

    public void removeProduct(Product product) {
        products.remove(product);
        mediator.onChanged(this);
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
