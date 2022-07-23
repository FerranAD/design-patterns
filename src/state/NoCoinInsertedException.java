package state;

public class NoCoinInsertedException extends RuntimeException {
    public NoCoinInsertedException() {
        super("No coin inserted");
    }
}
