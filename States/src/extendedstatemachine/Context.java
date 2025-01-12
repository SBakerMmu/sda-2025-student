package extendedstatemachine;

interface Context {
    void changeState(State nextState);
}
