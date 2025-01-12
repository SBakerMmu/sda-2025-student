package bridgeproduct;

class Tax {

    static final double NO_TAX = 0.0d;
    public static final Tax ZERO = new Tax(NO_TAX);
    final private double tax;

    public Tax(double tax) {
        //do the preconditions
        if (tax <= NO_TAX) {
            //throw exception
        }
        this.tax = tax;

    }

    public double get() {
        return tax;
    }

    @Override
    public String toString() {
        return String.format("%f", tax);
    }
}
