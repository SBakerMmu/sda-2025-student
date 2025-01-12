package taxratestrategy;

import java.util.Objects;

class FullPrice implements SellingPrice {
    static final FullPrice ZERO = new FullPrice();
    private static final double NO_PRICE = 0.0d;
    final private double price;

    private FullPrice() {
        this(NO_PRICE);
    }

    public FullPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof SellingPrice other) {
            return price == other.get();
        } else return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(price);
    }

    @Override
    public String toString() {
        return "FullPrice{" +
                "price=" + price +
                '}';
    }

    public double get() {
        return price;
    }

    @Override
    public SellingPrice applyDiscount(MinimumPrice minimum, Discount discount) {
        return new DiscountedPrice(this, minimum, discount);
    }


    @Override
    public SellingPrice removeDiscount() {
        return this;
    }
}
