package compositemenu;

class PasteAsPlainTextCommand implements Command {
    @Override
    public void execute() {
        System.out.printf("execute %s%n", this);
    }
}
