package orderobserver;

class Sauce implements PizzaComponent {

    private final PizzaComponent component;
    private final String name;
    private final double price;

    public Sauce(PizzaComponent component, String name, double price) {
        this.component = component;
        this.name = name;
        this.price = price;
    }


    @Override
    public String getDescription() {
        return String.format("%s, %s Sauce", component.getDescription(), name);
    }

    @Override
    public double getPrice() {
        return component.getPrice() + price;
    }
}
