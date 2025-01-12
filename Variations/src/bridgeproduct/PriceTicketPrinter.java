package bridgeproduct;

class PriceTicketPrinter implements ProductPrinter {
    @Override
    public void print(AmazonProduct product) {
        System.out.format("Price Ticket for Amazon ASIN:%s Price:%s%n", product.getAsin(), product.getPrice());
    }

    @Override
    public void print(RetailProduct product) {
        System.out.format("Price Ticket for Retail GTIN:%s Price:%s%n", product.getGtin(), product.getPrice());
    }
}
