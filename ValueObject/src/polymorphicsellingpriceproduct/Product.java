package polymorphicsellingpriceproduct;

class Product {

    private final MinimumPrice minimumPrice;
    private SellingPrice sellingPrice;

    public Product(FullPrice price, MinimumPrice minimumPrice) {
        this.sellingPrice = price;
        this.minimumPrice = minimumPrice;
    }

    public void applyDiscount(Discount discount) {

        sellingPrice = sellingPrice.applyDiscount(minimumPrice, discount);
    }

    public void removeDiscount() {

        sellingPrice = sellingPrice.removeDiscount();
    }

    public double getPrice() {
        return sellingPrice.get();
    }
}
