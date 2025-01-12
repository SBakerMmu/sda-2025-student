package bridgeproduct;


class RetailProductFactory implements ProductFactory {
    public Product create(String id, FullPrice price, MinimumPrice minimumPrice, TaxCalculation taxCalculation) throws InvalidException {
        CompanyPrefix prefix = new CompanyPrefix(Integer.parseInt(id.substring(0, CompanyPrefix.LENGTH)));
        ItemReference itemReference = new ItemReference(Integer.parseInt(id.substring(CompanyPrefix.LENGTH, GTIN13.LENGTH - 1)));
        GTIN13 gtin13 = new GTIN13(prefix, itemReference);
        return new RetailProduct(gtin13, price, minimumPrice, taxCalculation);
    }
}
