package mediator;

public final class Example {

    public static void run() {
        PricingMediator mediator = new PricingMediator();

        Basket basket = new Basket(mediator);
        Discounter discounter = new Discounter(mediator);
        mediator.registerColleagues(basket, discounter);

        Product a1 = new Product("A1", 50.0d);
        Product a2 = new Product("A2", 250.0d);

        basket.addProduct(a1);
        System.out.format("Using Mediator: Current price with discount: %s%n", basket.getTotalWithDiscount());
        basket.addProduct(a2);
        System.out.format("Using Mediator: Current price with discount: %s%n", basket.getTotalWithDiscount());
        discounter.setDiscountCode("Discount50");
        System.out.format("Using Mediator: Current price with discount: %s%n", basket.getTotalWithDiscount());
        discounter.setDiscountCode("Discount10");
        System.out.format("Using Mediator: Current price with discount: %s%n", basket.getTotalWithDiscount());
        basket.removeProduct(a2);
        System.out.format("Using Mediator: Current price with discount: %s%n", basket.getTotalWithDiscount());
    }


}
