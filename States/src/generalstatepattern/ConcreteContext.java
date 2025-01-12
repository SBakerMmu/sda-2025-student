package generalstatepattern;

class ConcreteContext implements Context {
    State state;

    ConcreteContext(State initialState) {
        state = initialState;
    }

    @Override
    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        this.state.handle(this);
    }
}
