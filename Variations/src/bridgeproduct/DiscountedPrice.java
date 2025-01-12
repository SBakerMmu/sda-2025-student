package bridgeproduct;

class DiscountedPrice implements SellingPrice {

    private final FullPrice fullPrice;
    private final MinimumPrice minimumPrice;
    private final Discount discount;
    private final Price sellingPrice;

    public DiscountedPrice(FullPrice fullPrice, MinimumPrice minimum, Discount discount) {
        this.fullPrice = fullPrice;
        this.minimumPrice = minimum;
        this.discount = discount;
        this.sellingPrice = calculatePrice();
        checkInvariants();
    }

    @Override
    public SellingPrice applyDiscount(MinimumPrice minimum, Discount discount) {
        return new DiscountedPrice(this.fullPrice, minimum, this.discount.add(discount));
    }

    @Override
    public SellingPrice removeDiscount() {

        return fullPrice;
    }


    void checkInvariants() {
        if (sellingPrice.get() < minimumPrice.get()) {
            //throw exception
        }
    }

    Price calculatePrice() {

        return discount.applyTo(fullPrice.get());

    }

    public Price get() {
        return sellingPrice;
    }

}
