package generalstrategy;

class Context {

    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void operation() {
        strategy.algorithm();
        ;
    }
}
