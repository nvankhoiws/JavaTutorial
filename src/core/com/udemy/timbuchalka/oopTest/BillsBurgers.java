package core.com.udemy.timbuchalka.oopTest;

import core.com.udemy.timbuchalka.oopTest.burgerFamily.Hamburger;
import core.com.udemy.timbuchalka.oopTest.burgerFamily.HealthyBurger;

public class BillsBurgers {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Spring Roll Bread", true);
        double grantPrice = hamburger.getGrantPrice();
        System.out.println("Current price " + grantPrice);

        hamburger.addThese(true, false, true, false);
        hamburger.checkHamburger();
        System.out.println("\n");
        hamburger.addThese(false, false, true, true);
        hamburger.addThese(true, true, true, true);
        hamburger.checkHamburger();
        System.out.println("\n");
        HealthyBurger healthyBurger = new HealthyBurger();
        System.out.println(healthyBurger.isBroccoli());
        System.out.println(healthyBurger.isBinna());
        System.out.println(healthyBurger.getBasePrice());
        System.out.println(healthyBurger.getAdditionalPrice());
        System.out.println(healthyBurger.getGrantPrice());
        System.out.println("\n");
        healthyBurger.addThese(true, false, true, false, true, false);
        System.out.println(healthyBurger.getAdditionalPrice());
        System.out.println(healthyBurger.getBasePrice());
        System.out.println(healthyBurger.getGrantPrice());
        healthyBurger.addMeat();

        System.out.println(healthyBurger.getAdditionalPrice());
        System.out.println(healthyBurger.getBasePrice());
        System.out.println(healthyBurger.getGrantPrice());

    }
}
