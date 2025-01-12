package bridgeproduct;

class Price {
    static final double NO_PRICE = 0.0d;
    final private double price;

    public Price(double price) {
        //do the preconditions
        if (price <= NO_PRICE) {
            //throw exception
        }
        this.price = price;

    }

    public double get() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%f", price);
    }
}
