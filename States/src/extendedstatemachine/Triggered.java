package extendedstatemachine;

class Triggered implements State {

    @Override
    public String toString() {
        return "Triggered";
    }

    @Override
    public void tick(Context context) {
        //ignore
    }

    @Override
    public void reset(Context context) {
        State next = new Countdown();
        System.out.printf("reset %s -> %s%n", this, next);
        context.changeState(next);
    }
}
