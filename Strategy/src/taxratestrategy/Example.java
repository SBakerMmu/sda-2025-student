package taxratestrategy;

public final class Example {

    public static void run() {

        System.out.format("Zero full price %s%n", FullPrice.ZERO);
        System.out.format("Zero discounted price %s%n", DiscountedPrice.ZERO);

        FullPrice fullPrice = new FullPrice(100.0d);
        DiscountedPrice discountPrice = new DiscountedPrice(new FullPrice(125.0d), MinimumPrice.NO_MINIMUM, new Discount(25d));
        System.out.format("full price = discount price %s%n", fullPrice.equals(discountPrice));


        MinimumPrice minimumPrice = new MinimumPrice(75.0d);
        TaxCalculation standardTax = new StandardRateTaxCalculation();
        Product product = new Product(fullPrice, minimumPrice, standardTax);
        System.out.format("%s%n", product.getPrice());
    }

}
