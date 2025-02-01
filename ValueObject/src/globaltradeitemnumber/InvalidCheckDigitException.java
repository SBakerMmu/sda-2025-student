package globaltradeitemnumber;

public class InvalidCheckDigitException extends InvalidException {
    public final String invalidString;

    public InvalidCheckDigitException(String s) {
        super(String.format("invalid check digit in %s", s));
        invalidString = s;
    }
}
