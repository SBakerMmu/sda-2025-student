package globaltradeitemnumber;

import java.util.Objects;

public final class CompanyPrefix {
    public static final int LENGTH = 6;
    private static final int MIN = 100000; //there is a rule about GS1 Company Prefixes being > 100000
    private static final int MAX = 999999;
    private final int value;


    public CompanyPrefix(int value) throws InvalidNumberRangeException {
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
        CompanyPrefix that = (CompanyPrefix) obj;
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
