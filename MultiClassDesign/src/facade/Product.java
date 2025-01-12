package facade;

class Product {

    private final String code;
    private final double price;

    Product(String code, double price) {
        this.code = code;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }
}
