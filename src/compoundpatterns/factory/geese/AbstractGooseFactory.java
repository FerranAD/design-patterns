package compoundpatterns.factory.geese;

import compoundpatterns.ducks.Quackable;
import compoundpatterns.geese.Goose;

public abstract class AbstractGooseFactory {
    public abstract Goose createGoose();
    public abstract Quackable createGooseDuck();
}
