package orderobserver;


class Pizza {

    PizzaComponent components;

    public Pizza(String baseName, double price) {

        this(new PizzaBase(baseName, price));
    }

    private Pizza(PizzaBase base) {
        components = base;
    }

    public Pizza addSauce(String name, double price) {
        components = new Sauce(components, name, price);
        return this;
    }

    public Pizza addTopping(String name, double price) {
        components = new Topping(components, name, price);
        return this;
    }

    public Pizza addCheese(String name, double price) {
        components = new Cheese(components, name, price);
        return this;
    }

    public String getDescription() {
        return components.getDescription();
    }

    public double getPrice() {
        return components.getPrice();
    }

}
