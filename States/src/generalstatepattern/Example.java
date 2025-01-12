package generalstatepattern;

public final class Example {

    public static void run() {
        ConcreteContext context = new ConcreteContext(new ConcreteStateA());
        context.request();
        context.request();
    }
}
