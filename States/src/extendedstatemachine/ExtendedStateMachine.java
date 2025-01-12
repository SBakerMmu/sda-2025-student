package extendedstatemachine;

class ExtendedStateMachine implements Context {
    private State currentState;

    ExtendedStateMachine() {
        currentState = new Countdown(); //initial state
    }

    @Override
    public void changeState(State nextState) {
        currentState = nextState;
    }

    public void tick() {
        currentState.tick(this);
    }

    public void reset() {
        currentState.reset(this);
    }
}
