package bridgeproduct;

public abstract class Product {

    private final MinimumPrice minimumPrice;
    private final TaxCalculation taxCalculation;
    private SellingPrice sellingPrice;

    protected Product(FullPrice price, MinimumPrice minimumPrice, TaxCalculation taxCalculation) {
        this.sellingPrice = price;
        this.minimumPrice = minimumPrice;
        this.taxCalculation = taxCalculation;
    }

    public void applyDiscount(Discount discount) {

        sellingPrice = sellingPrice.applyDiscount(minimumPrice, discount);
    }

    public void removeDiscount() {

        sellingPrice = sellingPrice.removeDiscount();
    }

    public Price getPrice() {
        Price sellingPriceExcludingTax = sellingPrice.get();
        Tax tax = taxCalculation.get(sellingPriceExcludingTax);
        return new Price(sellingPriceExcludingTax.get() + tax.get());
    }

    public abstract void print(ProductPrinter printer);
}
