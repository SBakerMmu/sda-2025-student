package bridgeproduct;

import java.util.Objects;

public final class ASIN {
    public static final int LENGTH = 10;
    private final String id;

    public ASIN(String id) throws InvalidException {

        if (!isValidLength(id)) {
            throw new InvalidLengthException(id, LENGTH);
        }

        if (!isValidCharacters(id)) {
            throw new InvalidCharacterException(id);
        }


        this.id = id;
    }

    static boolean isValid(String s) {
        return isValidLength(s) && isValidCharacters(s);
    }

    static boolean isValidLength(String s) {
        return Objects.nonNull(s) && s.length() == LENGTH;
    }

    static boolean isValidCharacters(String s) {
        for (int i = 0; i < LENGTH; i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c) && !Character.isLetter(c)) return false;
        }
        return true;
    }

    public static ASIN parse(String id) throws InvalidException {
        return new ASIN(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ASIN that = (ASIN) obj;
        return this.id.equalsIgnoreCase(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return String.format("%s", id);
    }
}
