package bridgeproduct;

class AmazonProductFactory implements ProductFactory {
    public Product create(String id, FullPrice price, MinimumPrice minimumPrice, TaxCalculation taxCalculation) throws InvalidException {
        ASIN asin = new ASIN(id);
        return new AmazonProduct(asin, price, minimumPrice, taxCalculation);
    }
}
