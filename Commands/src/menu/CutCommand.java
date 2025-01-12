package menu;

class CutCommand implements Command {
    @Override
    public void execute() {
        System.out.printf("execute %s%n", this);
    }

    @Override
    public void undo() {
        System.out.printf("undo %s%n", this);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CutCommand{");
        sb.append('}');
        return sb.toString();
    }
}
