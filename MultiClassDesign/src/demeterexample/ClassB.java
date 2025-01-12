package demeterexample;

public class ClassB {

    private final ClassC c = new ClassC();

    ClassC getC() {
        return new ClassC();
    }

    void doZ() {
        c.doZ();
    }
}
