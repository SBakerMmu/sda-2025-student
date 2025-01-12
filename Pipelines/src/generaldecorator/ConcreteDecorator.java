package generaldecorator;

class ConcreteDecorator implements Component {
    private final Component component;

    public ConcreteDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        //Decorator can add functionality before the call to the inner component
        //including changing any parameters
        component.operation();
        //Decorator can add functionality after the call to the inner component
        //including changing the return from the inner component
    }
}
