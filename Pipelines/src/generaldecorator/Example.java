package generaldecorator;

public final class Example {

    public static void run() {
        Component component = new ConcreteComponent();
        component = new ConcreteDecorator(component);
        component.operation();
    }

}
