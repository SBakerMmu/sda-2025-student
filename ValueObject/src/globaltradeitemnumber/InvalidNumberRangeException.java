package globaltradeitemnumber;

public class InvalidNumberRangeException extends InvalidException {
    public final int value;
    public final int min;
    public final int max;

    public InvalidNumberRangeException(int value, int min, int max) {
        super(String.format("Expected %d to be between %d and %d", value, min, max));
        this.value = value;
        this.min = min;
        this.max = max;
    }
}
