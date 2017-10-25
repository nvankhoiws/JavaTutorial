package core.com.udemy.timbuchalka.oopTest;

import core.com.udemy.timbuchalka.oopTest.burgerFamily.Hamburger2;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 10/25/20179:11 AM.
 */
public class BillsBurgers2 {
    public static void main(String[] args) {
        Hamburger2 hamburger2 = new Hamburger2("Spring Roll Bread");
        System.out.println("\n");
        System.out.println(hamburger2.getBasPrice());
        System.out.println(hamburger2.getAdditionalPrice());
        System.out.println(hamburger2.getGrantPrice());
        hamburger2.removeMeat();
        System.out.println(hamburger2.getBasPrice());
        System.out.println(hamburger2.getAdditionalPrice());
        System.out.println(hamburger2.getGrantPrice());
        hamburger2.checkThisHamburger();
        hamburger2.addThese(true, true, true, true);
        hamburger2.checkThisHamburger();
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
        System.out.println("\n");
        System.out.println();
    }
}
