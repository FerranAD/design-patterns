package combined.factory.geese;

import combined.ducks.Quackable;
import combined.geese.Goose;

public abstract class AbstractGooseFactory {
    public abstract Goose createGoose();
    public abstract Quackable createGooseDuck();
}
