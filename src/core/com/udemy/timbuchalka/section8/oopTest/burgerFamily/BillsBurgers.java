package core.com.udemy.timbuchalka.section8.oopTest.burgerFamily;

import core.com.udemy.timbuchalka.section8.oopTest.burgerFamily.classes.DeluxeBurger;
import core.com.udemy.timbuchalka.section8.oopTest.burgerFamily.classes.Hamburger;
import core.com.udemy.timbuchalka.section8.oopTest.burgerFamily.classes.HealthyBurger;

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

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println(deluxeBurger.getBasePrice());
        System.out.println(deluxeBurger.getAdditionalPrice());
        System.out.println(deluxeBurger.getGrantPrice());
        System.out.println("\n");
        deluxeBurger.addThese(true, true, true, true);
        System.out.println(deluxeBurger.getBasePrice());
        System.out.println(deluxeBurger.getAdditionalPrice());
        System.out.println(deluxeBurger.getGrantPrice());
        deluxeBurger.checkHamburger();


    }
}
