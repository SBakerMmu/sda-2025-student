package globaltradeitemnumber;

public class InvalidLengthException extends InvalidException {
    public final String invalidString;
    public final int maxLength;

    public InvalidLengthException(String s, int maxLength) {
        super(String.format("expected length %d", maxLength));
        this.invalidString = s;
        this.maxLength = maxLength;
    }

}
