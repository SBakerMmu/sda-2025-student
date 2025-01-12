package compositemenu;

class CutCommand implements Command {
    @Override
    public void execute() {
        System.out.printf("execute %s%n", this);
    }
}
