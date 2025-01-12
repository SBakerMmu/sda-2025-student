package extendedstatemachine;

class Countdown implements State {
    private int count = 3;

    @Override
    public String toString() {
        return String.format("Countdown(%d)", count);
    }

    @Override
    public void tick(Context context) {
        if (--count == 0) {
            State next = new Triggered();
            System.out.printf("tick %s -> %s%n", this, next);
            context.changeState(next);
        } else {
            //stay in this state
            System.out.printf("tick %s%n", this);
        }
    }

    @Override
    public void reset(Context context) {
        State next = new Countdown();
        System.out.printf("reset %s -> %s%n", this, next);
        context.changeState(next);
    }
}
