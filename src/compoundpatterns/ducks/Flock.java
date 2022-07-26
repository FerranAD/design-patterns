package compoundpatterns.ducks;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {
    private List<Quackable> quackers = new ArrayList();

    public void add(Quackable quacker) { quackers.add(quacker); }

    @Override
    public void quack() {
        for (var quacker: quackers) { quacker.quack(); }
    }
}
