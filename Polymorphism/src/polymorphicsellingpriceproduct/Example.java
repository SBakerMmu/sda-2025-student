package polymorphicsellingpriceproduct;

public final class Example {

    public static void run() {
        FullPrice fullPrice = new FullPrice(100.0d);
        MinimumPrice minimumPrice = MinimumPrice.NO_MINIMUM;
        Product product = new Product(fullPrice, minimumPrice);
        System.out.format("Product before discount %s\n", product.getPrice());
        product.applyDiscount(new Discount(5.00));
        System.out.format("Product after discount %s\n", product.getPrice());
        product.removeDiscount();
        System.out.format("Product after remove discount %s\n", product.getPrice());
    }
}
