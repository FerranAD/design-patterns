package exceptions;

import java.util.NoSuchElementException;

public class NoDataAvailableException extends NoSuchElementException {
    public NoDataAvailableException() {
        super("No data available");
    }
}
