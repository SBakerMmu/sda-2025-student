package bridgeproduct;

class StandardTax implements TaxCalculation {
    static final double STANDARD_RATE = 0.2d;
    static final int ROUNDING_DECIMALS = 2;
    static final double ROUNDING_SCALE = Math.pow(10, ROUNDING_DECIMALS);

    @Override
    public Tax get(Price price) {
        //This gets us into issues of how to round doubles correctly for tax purposes
        //This example for UK VAT the rules are documented in
        //https://www.gov.uk/hmrc-internal-manuals/vat-trader-records/vatrec12030
        //Instead a simple method using Math.round as this is an example
        double tax = price.get() * STANDARD_RATE;
        return new Tax(Math.round(tax * ROUNDING_SCALE) / ROUNDING_SCALE);
    }
}

