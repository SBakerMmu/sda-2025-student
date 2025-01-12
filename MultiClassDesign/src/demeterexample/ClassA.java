package demeterexample;

class ClassA {

    private final ClassB b = new ClassB();

    public ClassA() {

    }

    public ClassB getB() {
        return b;
    }

    public void doZ() {
        b.doZ();
    }
}
