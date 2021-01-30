public class Billsmain {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Chicken",3.56, "white");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato",0.26);
        hamburger.addHamburgerAddition2("Lettuce",0.75);
        hamburger.addHamburgerAddition3("Cheese",1.12);
        //price = hamburger.itemizeHamburger();
        System.out.println("Total Burger price is" + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Mutton",5.62);
        healthyBurger.addHamburgerAddition1("Egg",2.5);
        healthyBurger.addHealthAddition1("Curd",1.25);
        System.out.println("Total Healthy Burger Price is" + healthyBurger.itemizeHamburger() );

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Chocolate",12.5);
        db.itemizeHamburger();

    }

}
