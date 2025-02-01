package globaltradeitemnumber;

public class InvalidCharacterException extends InvalidException {
    public final String invalidString;

    public InvalidCharacterException(String s) {
        super(String.format("Invalid character(s) is %s", s));
        this.invalidString = s;
    }
}
