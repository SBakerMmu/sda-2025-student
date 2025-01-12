package generalstatepattern;

class ConcreteStateB implements State {

    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateA());
    }
}

