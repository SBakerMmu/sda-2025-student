package generalchainofresponsiblity;

public final class Example {

    public static void run() {
        Handler handler = new ConcreteHandler(new DefaultHandler());
        handler.operation();
    }

}
