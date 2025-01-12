package taxratestrategy;

class StandardRateTaxCalculation implements TaxCalculation {
    private static final double STANDARD_RATE = 0.2d;
    private static final int ROUNDING_DECIMALS = 2;
    private static final double ROUNDING_SCALE = Math.pow(10, ROUNDING_DECIMALS);

    @Override
    public double get(double price) {
        //This gets us into issues of how to round doubles correctly for tax purposes
        //This example for UK VAT the rules are documented in
        //https://www.gov.uk/hmrc-internal-manuals/vat-trader-records/vatrec12030
        //Instead a simple method using Math.round as this is an example
        double tax = price * STANDARD_RATE;
        return Math.round(tax * ROUNDING_SCALE) / ROUNDING_SCALE;
    }
}

