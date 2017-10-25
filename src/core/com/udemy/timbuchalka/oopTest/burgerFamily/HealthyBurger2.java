package core.com.udemy.timbuchalka.oopTest.burgerFamily;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 10/25/201712:53 PM.
 */
public class HealthyBurger2 {
    Hamburger2 hamburger2;

    public HealthyBurger2() {
        this.hamburger2 = new Hamburger2("Healthy Burger Bread Roll");
    }

    public void addThese(boolean lettuce, boolean tomato, boolean carrot, boolean cheese, boolean broccoli, boolean binna){
        getHamburger2().getAdditionals().addLettuce(lettuce);
        getHamburger2().getAdditionals().addTomato(tomato);
        getHamburger2().getAdditionals().addCarrot(carrot);
        getHamburger2().getAdditionals().addCheese(cheese);
        getHamburger2().getAdditionals().addBroccoli(broccoli);
        getHamburger2().getAdditionals().addBinna(binna);
    }

    public void removeMeat(){
        getHamburger2().getBaseBurger().addMeat(false);
    }

    public double getGrantPrice(){
        return getBasePrice() + getAdditionalPrice();
    }

    public double getBasePrice(){
        return getHamburger2().getBaseBurger().getBasePrice();
    }

    public double getAdditionalPrice(){
        return getHamburger2().getAdditionals().getAdditionalPrice();
    }

    public void checkThisHamburger(){
        String lettuce = (getHamburger2().getAdditionals().isLettuce()) ? "lettuce, " : "";
        String tomato = (getHamburger2().getAdditionals().isTomato()) ? "tomato, " : "";
        String carrot = (getHamburger2().getAdditionals().isCarrot()) ? "carrot, " : "";
        String cheese = (getHamburger2().getAdditionals().isCheese()) ? "cheese, " : "";
        String meat = (getHamburger2().getBaseBurger().isMeat()) ? "meat, " : "";
        String broccoli = (getHamburger2().getAdditionals().isBroccoli()) ? "broccoli, " : "";
        String binna = (getHamburger2().getAdditionals().isBinna()) ? "binna, " : "";
        System.out.println("This healthy hamburger has " + getHamburger2().getBaseBurger().getBreadRollType() + ", "+ meat + lettuce + tomato + carrot + cheese + broccoli + binna);
        System.out.println("This healthy hamburger has base price is " + getBasePrice());
        System.out.println("This healthy hamburger has additional price is " + getAdditionalPrice());
        System.out.println("The grant price of healthy hamburger is " + getGrantPrice());
    }

    private Hamburger2 getHamburger2() {
        return hamburger2;
    }
}
