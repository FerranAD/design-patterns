package templatemethod.withhooks;

public abstract class CaffeineBeverageWithHooks {

    public final void prepareRecipe() {
        boilWater();
        // Hook method gives the subclass a chance to react to a step of the algorithm.
        onWaterBoiled();
        brew();
        pourInCup();
        addCondiments();
    }

    public final void boilWater() {
        System.out.println("Boiling water");
    }

    // By default does nothing, but can be overrided to provide additional behavior.
    public void onWaterBoiled() { }

    public final void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public abstract void brew();

    public abstract void addCondiments();
}
