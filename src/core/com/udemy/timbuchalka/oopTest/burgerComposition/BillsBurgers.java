package core.com.udemy.timbuchalka.oopTest.burgerComposition;

import core.com.udemy.timbuchalka.oopTest.burgerComposition.classes.Hamburger;
import core.com.udemy.timbuchalka.oopTest.burgerComposition.classes.HealthyBurger;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 10/25/20179:11 AM.
 */
public class BillsBurgers {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Spring Roll Bread");
        System.out.println("\n");
        System.out.println(hamburger.getBasPrice());
        System.out.println(hamburger.getAdditionalPrice());
        System.out.println(hamburger.getGrantPrice());
        System.out.println("\n");
        hamburger.removeMeat();
        System.out.println(hamburger.getBasPrice());
        System.out.println(hamburger.getAdditionalPrice());
        System.out.println(hamburger.getGrantPrice());
        hamburger.checkThisHamburger();
        System.out.println("\n");
        hamburger.addThese(true, true, true, true);
        hamburger.checkThisHamburger();
        System.out.println("\n");
        HealthyBurger healthyBurger = new HealthyBurger();
        healthyBurger.checkThisHamburger();
        System.out.println("lettuce price" + healthyBurger.checkPrices("lettuce"));
        System.out.println("\n");
        System.out.println();
        System.out.println("\n");
        System.out.println();
        System.out.println("\n");
        System.out.println();
        System.out.println("\n");
        System.out.println();
        System.out.println("\n");
        System.out.println();
    }
}
