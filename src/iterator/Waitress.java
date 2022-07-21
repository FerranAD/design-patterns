package iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeHouseMenu);
        System.out.println("\nLUNCH");
        printMenu(dinerMenu);
    }

    private void printMenu(Menu menu) {
        for (MenuItem menuItem : menu) {
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
