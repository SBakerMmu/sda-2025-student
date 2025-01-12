package bridgeproduct;

class BagLabelPrinter implements ProductPrinter {
    @Override
    public void print(AmazonProduct product) {
        System.out.format("Bag Label for Amazon ASIN:%s Price:%s%n", product.getAsin(), product.getPrice());
    }

    @Override
    public void print(RetailProduct product) {
        System.out.format("Bag Label for Retail GTIN:%s Price:%s%n", product.getGtin(), product.getPrice());
    }
}
