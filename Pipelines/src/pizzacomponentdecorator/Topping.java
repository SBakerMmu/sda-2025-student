package pizzacomponentdecorator;

class Topping implements PizzaComponent {

    private final PizzaComponent component;
    private final String name;
    private final double price;

    public Topping(PizzaComponent component, String name, double price) {
        this.component = component;
        this.name = name;
        this.price = price;
    }


    @Override
    public String getDescription() {
        return String.format("%s, %s Topping", component.getDescription(), name);
    }

    @Override
    public double getPrice() {
        return component.getPrice() + price;
    }
}
