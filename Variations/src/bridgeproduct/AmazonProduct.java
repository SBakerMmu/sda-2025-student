package bridgeproduct;


class AmazonProduct extends Product {
    private final ASIN asin;

    public AmazonProduct(ASIN asin, FullPrice price, MinimumPrice minimumPrice, TaxCalculation taxCalculation) {
        super(price, minimumPrice, taxCalculation);
        this.asin = asin;
    }

    public ASIN getAsin() {
        return asin;
    }

    @Override
    public void print(ProductPrinter printer) {
        printer.print(this);
    }

    @Override
    public String toString() {
        return asin.toString();
    }
}
