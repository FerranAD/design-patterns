package compoundpatterns.factory.geese;

import compoundpatterns.ducks.Quackable;
import compoundpatterns.geese.Goose;
import compoundpatterns.geese.GooseAdapter;

public class GooseFactory extends AbstractGooseFactory {
    @Override
    public Goose createGoose() {
        return new Goose();
    }

    @Override
    public Quackable createGooseDuck() {
        return new GooseAdapter(new Goose());
    }
}
