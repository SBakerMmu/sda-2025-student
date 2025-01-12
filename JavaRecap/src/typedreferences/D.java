package typedreferences;

//D is a subtype of MyInterface
public class D implements MyInterface {
    @Override
    public void interfaceMethodA() {
        System.out.printf("Hello from D.interfaceMethodA%n");
    }

    public void methodA() {
        System.out.printf("Hello from D.methodA%n");
    }
}
