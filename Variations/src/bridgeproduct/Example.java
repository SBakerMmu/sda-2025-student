package bridgeproduct;

public final class Example {

    public static void run() {

        try {


            FullPrice fullPrice = new FullPrice(100.0d);
            MinimumPrice minimumPrice = new MinimumPrice(75.0d);
            TaxCalculation standardTax = new StandardTax();

            print(new AmazonProduct(new ASIN("B09P4L33SW"), fullPrice, minimumPrice, standardTax), new BagLabelPrinter());
            print(new RetailProduct(new GTIN13(new CompanyPrefix(705353), new ItemReference(135569)), fullPrice, minimumPrice, standardTax),  new PriceTicketPrinter());

            print(new AmazonProductFactory(), "B09P4L33SW", fullPrice, minimumPrice, standardTax, new PriceTicketPrinter());
            print( new RetailProductFactory(), "705353135569", fullPrice, minimumPrice, standardTax, new BagLabelPrinter());

        } catch (InvalidException ex) {
            System.out.format("%s/n", ex);
        }
    }

    private static void print(ProductFactory productFactory, String code, FullPrice fullPrice, MinimumPrice minimumPrice, TaxCalculation taxCalculation, ProductPrinter printer) throws InvalidException {
        print(productFactory.create(code, fullPrice, minimumPrice, taxCalculation), printer);
    }

    private static void print(Product product, ProductPrinter printer) {
        product.print(printer);
    }

}
