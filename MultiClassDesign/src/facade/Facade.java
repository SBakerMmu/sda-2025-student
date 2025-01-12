package facade;

class Facade {

    private final Basket basket = new Basket();
    private final Discounter discounter = new Discounter();

    public void addProduct(Product product) {
        basket.addProduct(product);
        discounter.setTotal(basket.getTotal());
        basket.setDiscount(discounter.getDiscount());
    }

    public void setDiscountCode(String code) {
        discounter.setDiscountCode(code);
        basket.setDiscount(discounter.getDiscount());
    }

    public double getTotalWithDiscount() {
        return basket.getTotalWithDiscount();
    }
}
