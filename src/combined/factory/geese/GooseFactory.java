package combined.factory.geese;

import combined.ducks.Quackable;
import combined.geese.Goose;
import combined.geese.GooseAdapter;

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
