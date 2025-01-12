package generalstrategy;

public final class Example {

    public static void run() {
        Strategy strategy = new ConcreteStrategy();
        Context context = new Context(strategy);
        context.operation(); //will use the provided ConcreteStrategy
    }

}
