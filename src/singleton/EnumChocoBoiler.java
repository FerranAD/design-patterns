package singleton;

public enum EnumChocoBoiler {
    INSTANCE;

    private boolean empty;
    private boolean boiled;

    EnumChocoBoiler() {
        empty = true;
        boiled = false;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) boiled = true;
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) empty = true;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
