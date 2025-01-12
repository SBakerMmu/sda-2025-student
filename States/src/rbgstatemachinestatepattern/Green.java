package rbgstatemachinestatepattern;

class Green implements State {

    private final static String NAME = "Green";

    @Override
    public String toString() {
        return NAME;
    }

    @Override
    public void forward(Context context) {
        State next = new Red();
        System.out.printf("forward %s -> %s%n", this, next);
        context.changeState(next);
    }

    @Override
    public void reverse(Context context) {
        State previous = new Blue();
        System.out.printf("reverse %s -> %s%n", this, previous);
        context.changeState(previous);
    }
}
