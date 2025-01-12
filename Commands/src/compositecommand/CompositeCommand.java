package compositecommand;

import java.util.ArrayList;
import java.util.List;

class CompositeCommand implements Command {

    private final List<Command> commands = new ArrayList<>();

    void add(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        commands.forEach(Command::execute);
    }

    @Override
    public void undo() {
        commands.reversed().forEach(Command::undo);
    }
}
