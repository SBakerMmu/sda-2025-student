package simpleobserver;

public final class Example {
    public static void run() {
        MyClassObserver observer = new ConsoleObserver();
        MyClass myClass = new MyClass(observer);
        myClass.myOperation("ABC123");
    }
}
