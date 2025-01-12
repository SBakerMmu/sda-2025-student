package typedreferences;

//E is a subtype of D and MyInterface
public class E extends D {
    @Override
    public void methodA() {
        System.out.printf("Hello from E.methodA%n");
    }

    public void methodB() {
        System.out.printf("Hello from E.methodB%n");
    }
}
