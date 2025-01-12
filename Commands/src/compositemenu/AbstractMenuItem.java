package compositemenu;

import java.util.Objects;

abstract class AbstractMenuItem implements MenuItem {
    static final String INDENT = "   ";
    protected final String name;
    private final AbstractMenuItem parent;

    AbstractMenuItem(AbstractMenuItem parent, String name) {
        this.parent = parent;
        this.name = name;
    }

    @Override
    public abstract void display();

    protected String indent() {
        return Objects.isNull(parent) ? "" : String.format("%s%s", parent.indent(), INDENT);
    }
}
