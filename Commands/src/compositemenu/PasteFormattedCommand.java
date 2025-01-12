package compositemenu;

class PasteFormattedCommand implements Command {
    @Override
    public void execute() {
        System.out.printf("execute %s%n", this);
    }
}
