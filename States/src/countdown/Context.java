package countdown;

interface Context {
    void setState(State newState);
    State getCurrentState();

}
