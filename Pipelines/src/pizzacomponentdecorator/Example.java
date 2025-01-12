package pizzacomponentdecorator;

public final class Example {

    public static void run() {
        PizzaComponent base = new PizzaBase("Italian", 2.50d);
        show(base);
        PizzaComponent sauce = new Sauce(base, "Tomato", 2.00);
        show(sauce);
        PizzaComponent topping = new Topping(sauce, "Pepperoni", 0.75d);
        show(topping);
        PizzaComponent cheese = new Cheese(topping, "Mozzarella", 1.30d);
        show(cheese);


        PizzaComponent pizza = new Cheese(
                new Topping(
                        new Sauce(
                                new PizzaBase("Stuffed Crust", 3.80d),
                                "BBQ", 2.50d
                        ), "Mushroom", 0.50d
                ), "Cheddar", 1.50d
        );
        show(pizza);

    }

    private static void show(PizzaComponent pizza) {
        System.out.format("Order for %s\n", pizza.getDescription());
        System.out.format("Price %.2f\n", pizza.getPrice());
    }

}
