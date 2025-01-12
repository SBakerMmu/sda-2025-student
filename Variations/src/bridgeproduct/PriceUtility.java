package bridgeproduct;

final class PriceUtility {


    //Price constructor
    private PriceUtility() {
    }

    public static double getPounds(Price price) {
        return Math.floor(price.get());
    }

    public static double getPence(Price price) {
        return price.get() - PriceUtility.getPounds(price);
    }
}
