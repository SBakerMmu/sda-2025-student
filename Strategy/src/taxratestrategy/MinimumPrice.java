package taxratestrategy;

import java.util.Objects;

class MinimumPrice {
    public static final MinimumPrice NO_MINIMUM = new MinimumPrice();
    static final double NONE = 0.0d;
    final private double price;

    private MinimumPrice() {
        this(NONE);
    }

    public MinimumPrice(double price) {
        //do the preconditions
        if (price < NONE) {
            //throw exception
        }
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MinimumPrice that = (MinimumPrice) o;
        return Double.compare(price, that.price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(price);
    }

    @Override
    public String toString() {
        return "MinimumPrice{" +
                "price=" + price +
                '}';
    }

    public double get() {
        return price;
    }
}
