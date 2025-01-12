package mediator;

class PricingMediator implements Mediator {
    private Basket basket;
    private Discounter discounter;

    public void registerColleagues(Basket basket, Discounter discounter) {
        this.basket = basket;
        this.discounter = discounter;
    }

    @Override
    public void onChanged(Colleague colleague) {

        if (colleague == basket) {
            discounter.setGoodsValue(basket.getTotal());
        }
        if (colleague == discounter) {
            basket.setDiscount(discounter.getDiscount());
        }
    }
}
