package templatemethod.withhooks;

public class TeaHooks extends CaffeineBeverageWithHooks {
    public void brew() {
        System.out.println("Steeping the tea");
    }

    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
