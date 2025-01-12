package rbgstatemachinestatepattern;

interface Context {
    void changeState(State nextState);
}
