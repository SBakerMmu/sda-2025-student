package bridgeproduct;


class RetailProduct extends Product {
    private final GTIN13 id;

    public RetailProduct(GTIN13 id, FullPrice price, MinimumPrice minimumPrice, TaxCalculation taxCalculation) {
        super(price, minimumPrice, taxCalculation);
        this.id = id;
    }

    public GTIN13 getGtin() {
        return id;
    }

    @Override
    public void print(ProductPrinter printer) {
        printer.print(this);
    }

    @Override
    public String toString() {
        return id.toString();
    }
}
