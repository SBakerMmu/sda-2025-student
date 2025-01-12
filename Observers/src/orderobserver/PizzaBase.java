package orderobserver;

class PizzaBase implements PizzaComponent {

    private final String name;
    private final double price;

    PizzaBase(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return String.format("%s Base", name);
    }

    @Override
    public double getPrice() {
        return price;
    }
}
