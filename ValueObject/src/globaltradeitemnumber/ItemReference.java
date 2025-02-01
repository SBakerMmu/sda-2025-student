package globaltradeitemnumber;

import java.util.Objects;

public final class ItemReference {

    public static final int LENGTH = 6;
    private static final int MIN = 1;
    private static final int MAX = 999999;
    private final int value;

    public ItemReference(int value) throws InvalidNumberRangeException {
        if (value < MIN || value > MAX) {
            throw new InvalidNumberRangeException(value, MIN, MAX);
        }
        this.value = value;
    }

    public int get() {
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
        ItemReference that = (ItemReference) obj;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        //pad out with 0s when converting to string
        return String.format("%06d", value);
    }
}
