package core.com.udemy.timbuchalka.section8.oopTest.burgerComposition.classes;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 10/25/201712:53 PM.
 */
public class HealthyBurger{
    private BaseBurger baseBurger;
    private Additionals additionals;

    public HealthyBurger() {
        this.baseBurger = new BaseBurger("Brow Rye Bread Roll");
        this.additionals = new Additionals();
    }

    public void addThese(boolean lettuce, boolean tomato, boolean carrot, boolean cheese, boolean broccoli, boolean binna){
        additionals = new Additionals(true, true, true, true, true, true);
    }

    public void removeMeat(){
        baseBurger.addMeat(false);
    }

    public double getGrantPrice(){
        return baseBurger.getBasePrice() + additionals.getAdditionalPrice();
    }

    public double getBasePrice(){
        return baseBurger.getBasePrice();
    }

    public double getAdditionalPrice(){
        return additionals.getAdditionalPrice();
    }

    public void checkThisHamburger(){
        String lettuce = (additionals.isLettuce()) ? "lettuce, " : "";
        String tomato = (additionals.isTomato()) ? "tomato, " : "";
        String carrot = (additionals.isCarrot()) ? "carrot, " : "";
        String cheese = (additionals.isCheese()) ? "cheese, " : "";
        String broccoli = (additionals.isBroccoli()) ? "broccoli, " : "";
        String binna = (additionals.isBinna()) ? "binna, " : "";
        String meat = (baseBurger.isMeat()) ? "meat, " : "";
        System.out.println("This hamburger has " + baseBurger.getBreadRollType() + ", "+ meat + lettuce + tomato + carrot + cheese + broccoli + binna);
        System.out.println("This hamburger has base price is " + baseBurger.getBasePrice());
        System.out.println("This hamburger has additional price is " + additionals.getAdditionalPrice());
        System.out.println("The grant price of hamburger is " + getGrantPrice());
    }

    public double checkPrices(String item){
        return new CheckPrices().checkPrices(getBaseBurger(), getAdditionals(), item);
    }

    public BaseBurger getBaseBurger() {
        return baseBurger;
    }

    public Additionals getAdditionals() {
        return additionals;
    }
}
