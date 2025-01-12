package compositemenu;

class DeleteCommand implements Command {
    @Override
    public void execute() {
        System.out.printf("execute %s%n", this);
    }
}
