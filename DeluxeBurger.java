public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Delux", "Chicken & Mutton",14.54, "White");
        super.addHamburgerAddition1("Chips" ,2.75);
        super.addHamburgerAddition2("Drink" , 1.84);
    }
    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("DairyMilk");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Panipuri");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("chicken65");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("chickenpops");
    }
}