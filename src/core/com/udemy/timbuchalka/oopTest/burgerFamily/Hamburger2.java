package core.com.udemy.timbuchalka.oopTest.burgerFamily;

public class Hamburger2 {
    private BaseBurger baseBurger;
    private Additionals additionals;
    private double grantPrice;

    public Hamburger2() {
        this.baseBurger = new BaseBurger(null);
        this.grantPrice = baseBurger.getBasePrice();
    }
}