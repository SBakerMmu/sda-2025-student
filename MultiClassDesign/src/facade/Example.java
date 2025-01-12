package facade;

public final class Example {

    public static void run() {
        Facade facade = new Facade();

        Product a1 = new Product("A1", 50.0d);
        Product a2 = new Product("A2", 250.0d);

        facade.addProduct(a1);
        System.out.format("Using Facade: Current price with discount: %s%n", facade.getTotalWithDiscount());
        facade.addProduct(a2);
        System.out.format("Using Facade: Current price with discount: %s%n", facade.getTotalWithDiscount());
        facade.setDiscountCode("Discount50");
        System.out.format("Using Facade: Current price with discount: %s%n", facade.getTotalWithDiscount());
    }


}
