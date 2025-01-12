package taxratestrategy;

import java.util.Objects;

class ProductPrice {

    public static ProductPrice ZER0 = new ProductPrice();

    private static double Zero = 0.0d;
    private final double price;
    private final double tax;
    private final double total;

    private ProductPrice() {
        this(Zero, Zero);
    }

    public ProductPrice(double price, double tax) {
        this.price = price;
        this.tax = tax;
        this.total = this.price + this.tax;
    }

    public double getPrice() {
        return price;
    }

    public double getTax() {
        return tax;
    }

    public double getTotal() {
        return total;
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ProductPrice that)) return false;
        return Double.compare(price, that.price) == 0 && Double.compare(tax, that.tax) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, tax);
    }

    @Override
    public String toString() {
        return "ProductPrice{" + "price=" + price + ", tax=" + tax +  ", total=" + total + "}";
    }
}
