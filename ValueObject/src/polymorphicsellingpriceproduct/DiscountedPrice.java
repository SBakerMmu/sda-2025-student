package polymorphicsellingpriceproduct;

import java.util.Objects;

class DiscountedPrice implements SellingPrice {

    public final static DiscountedPrice ZERO = new DiscountedPrice();
    private final FullPrice fullPrice;
    private final Discount discount;
    private final double price;

    private DiscountedPrice() {
        this(FullPrice.ZERO, MinimumPrice.NO_MINIMUM, Discount.NO_DISCOUNT);
    }

    public DiscountedPrice(FullPrice fullPrice, MinimumPrice minimum, Discount discount) {
        this.fullPrice = fullPrice;
        this.discount = discount;
        this.price = fullPrice.get() - discount.get();
        //check invariant
        if (price < minimum.get()) {
            //throw exception
        }
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
    public SellingPrice applyDiscount(MinimumPrice minimum, Discount discount) {
        return new DiscountedPrice(this.fullPrice, minimum, discount);
    }

    @Override
    public SellingPrice removeDiscount() {
        return fullPrice;
    }

    @Override
    public String toString() {
        return "DiscountedPrice{" +
                "fullPrice=" + fullPrice +
                ", discount=" + discount +
                ", sellingPrice=" + price +
                '}';
    }

    @Override
    public double get() {
        return price;
    }

}
