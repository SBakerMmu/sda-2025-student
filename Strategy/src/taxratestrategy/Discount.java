package taxratestrategy;

import java.util.Objects;

class Discount {
    public static final Discount NO_DISCOUNT = new Discount();
    private static final double NONE = 0.0d;
    private final double discount;

    private Discount() {
        this(NONE);
    }

    public Discount(double discount) {
        //do the preconditions
        if (discount < NONE) {
            //throw an exception
        }
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Discount discount1 = (Discount) o;
        return Double.compare(discount, discount1.discount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(discount);
    }

    @Override
    public String toString() {
        return "Discount{" +
                "discount=" + discount +
                '}';
    }

    public double get() {
        return discount;
    }
}
