package generalbridge;

abstract class Abstraction {
    protected final Implementor implementor;

    public Abstraction(Implementor implementor) {

        this.implementor = implementor;
    }

    public abstract void operation();
}
