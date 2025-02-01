package globaltradeitemnumber;

public abstract class InvalidException extends Exception {
    public InvalidException() {
    }

    public InvalidException(String message) {
        super(message);
    }
}

