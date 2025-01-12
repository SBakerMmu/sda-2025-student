package rbgstatemachinestatepattern;

class Blue implements State {

    private static String NAME = "Blue";

    @Override
    public String toString() {
        return NAME;
    }

    @Override
    public void forward(Context context) {
        State next = new Green();
        System.out.printf("forward %s -> %s%n", this, next);
        context.changeState(next);
    }

    @Override
    public void reverse(Context context) {
        State previous = new Red();
        System.out.printf("reverse %s -> %s%n", this, previous);
        context.changeState(previous);
    }
}
