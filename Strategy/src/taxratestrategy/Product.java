package taxratestrategy;

class Product {

    private final MinimumPrice minimumPrice;
    private final TaxCalculation taxCalculation;
    private SellingPrice sellingPrice;

    public Product(FullPrice price, MinimumPrice minimumPrice, TaxCalculation taxCalculation) {
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

    public ProductPrice getPrice() {
        double sellingPriceExcludingTax = sellingPrice.get();
        double tax = taxCalculation.get(sellingPriceExcludingTax);
        return new ProductPrice(sellingPriceExcludingTax, tax);
    }
}
