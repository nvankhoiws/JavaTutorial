package core.com.udemy.timbuchalka.oopTest;

import core.com.udemy.timbuchalka.oopTest.burgerFamily.Hamburger;

public class BillsBurgers {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Spring Roll Bread", true);
        double grantPrice = hamburger.getGrantPrice();
        System.out.println("Current price " + grantPrice);

        hamburger.addThese(true, false, true, false);
        hamburger.checkHamburger();

        hamburger.addThese(false, false, true, true);
        hamburger.addThese(true, true, true, true);
        hamburger.checkHamburger();
    }
}
