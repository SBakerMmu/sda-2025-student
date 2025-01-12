package bridgeproduct;

class Discount {
    static final Discount NO_DISCOUNT = new Discount();
    static final double MIN_DISCOUNT = 0.0d;
    static final double MAX_DISCOUNT = 1.0d;
    private final double discount;

    Discount() {
        discount = 0.0d;
    }

    public Discount(double discount) {
        //do the preconditions
        if (discount < MIN_DISCOUNT || discount > MAX_DISCOUNT) {
            //throw an exception
        }
        this.discount = discount;
    }

    public double get() {
        return discount;
    }

    public Discount add(Discount discount) {
        return new Discount(this.discount + discount.get());
    }

    double applyTo(double value) {
        return value - (value * discount);
    }

    Price applyTo(Price value) {
        return new Price(applyTo(value.get()));
    }
}
