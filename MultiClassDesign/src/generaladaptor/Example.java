package generaladaptor;

public final class Example {

    public static void run() {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        //ends up calling operation2() on the adaptee
        target.operation();
    }
}
