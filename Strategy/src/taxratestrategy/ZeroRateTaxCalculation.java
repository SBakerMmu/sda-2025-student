package taxratestrategy;

class ZeroRateTaxCalculation implements TaxCalculation {
    static final double NONE = 0.0d;

    @Override
    public double get(double price) {
        return NONE;
    }
}
