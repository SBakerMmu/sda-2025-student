package simplecommand;

class AddCommand implements Command {

    private final MyClass receiver;
    private final int i;

    AddCommand(MyClass instanceOfMyClass, int i) {
        this.receiver = instanceOfMyClass;
        this.i = i;
    }

    @Override
    public void execute() {
        receiver.add(i);
    }

    @Override
    public void undo() {
        receiver.add(-i);
    }
}
