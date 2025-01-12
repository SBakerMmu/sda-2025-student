package rbgstatemachinestatepattern;

class Red implements State {
    private final static String NAME = "Red";

    @Override
    public String toString() {
        return NAME;
    }

    @Override
    public void forward(Context context) {
        State next = new Blue();
        System.out.printf("forward %s -> %s%n", this, next);
        context.changeState(next);
    }

    @Override
    public void reverse(Context context) {
        State previous = new Green();
        System.out.printf("reverse %s -> %s%n", this, previous);
        context.changeState(previous);
    }
}
