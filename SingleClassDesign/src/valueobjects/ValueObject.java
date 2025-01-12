package valueobjects;

import java.util.Objects;

public final class ValueObject {

    //Create a Constant object that represents a common value such as Zero or One
    public final static ValueObject Zero = new ValueObject(0);
    public final static ValueObject One  = new ValueObject(1);

    private final int value;

    public ValueObject(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ValueObject that = (ValueObject) obj;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString()
    {
        return String.format("%d", value);
    }
}
