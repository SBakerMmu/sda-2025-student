package rbgstatemachinestatepattern;

class MultipleEventStateMachine implements Context {
    private State currentState;

    MultipleEventStateMachine() {
        currentState = new Red(); //initial state
    }

    @Override
    public void changeState(State nextState) {
        currentState = nextState;
    }

    public void forward() {
        currentState.forward(this);
    }

    public void reverse() {
        currentState.reverse(this);
    }
}
