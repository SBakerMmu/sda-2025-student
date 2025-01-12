package orderobserver;

class Cheese implements PizzaComponent {

    private final PizzaComponent component;
    private final String description;
    private final double price;

    public Cheese(PizzaComponent component, String description, double price) {
        this.component = component;
        this.description = description;
        this.price = price;
    }


    @Override
    public String getDescription() {
        return String.format("%s, %s Cheese", component.getDescription(), description);
    }

    @Override
    public double getPrice() {
        return component.getPrice() + price;
    }
}
