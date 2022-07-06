package templatemethod.withhooks;

public class CoffeeHooks extends CaffeineBeverageWithHooks {

    @Override
    public void onWaterBoiled() {
        System.out.println("Yay the water is boiled!");
    }

    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
