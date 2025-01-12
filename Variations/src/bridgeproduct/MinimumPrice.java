package bridgeproduct;

class MinimumPrice {
    static final double NO_PRICE = 0.0d;
    public static final MinimumPrice ZERO = new MinimumPrice(MinimumPrice.NO_PRICE);
    final private double price;

    public MinimumPrice(double price) {
        //do the preconditions
        if (price <= NO_PRICE) {

            //throw exception
        }
        this.price = price;

    }

    public double get() {
        return price;
    }

}
