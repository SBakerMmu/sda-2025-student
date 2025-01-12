package multiobserver;

public final class Example {
    public static void run() {
        MyClass myClass = new MyClass();
        myClass.addObserver(new ConsoleObserver());
        myClass.addObserver(new NullObserver());
        myClass.myOperation("ABC123");
    }
}
