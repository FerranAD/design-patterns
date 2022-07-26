package compoundpatterns;

import compoundpatterns.ducks.Quackable;

public class QuackCounter implements Quackable {
    private final Quackable quacker;
    private static int quacks;

    public QuackCounter(Quackable quacker) {
        this.quacker = quacker;
        quacks = 0;
    }


    @Override
    public void quack() {
        quacker.quack();
        quacks++;
    }

    public static int getQuacks() {
        return QuackCounter.quacks;
    }
}
