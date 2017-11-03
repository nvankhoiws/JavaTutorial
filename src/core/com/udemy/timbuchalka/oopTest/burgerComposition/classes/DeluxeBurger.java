package core.com.udemy.timbuchalka.oopTest.burgerComposition.classes;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 11/3/20174:02 PM.
 */
public class DeluxeBurger {
    private BaseBurger baseBurger;
    private Additionals additionals;

    public DeluxeBurger() {
        this.baseBurger = new BaseBurger("Deluxe Bread Roll");
        this.additionals = new Additionals();
    }

    public void addThese(boolean drinks, boolean chips){
        additionals = new Additionals(true, true);
    }

    public void removeMeat(){
        baseBurger.addMeat(false);
    }

    public double getGrantPrice(){
        return baseBurger.getBasePrice() + additionals.getAdditionalPrice();
    }

    public double getBasPrice(){
        return baseBurger.getBasePrice();
    }

    public double getAdditionalPrice(){
        return additionals.getAdditionalPrice();
    }

    public void checkThisHamburger(){
        String drinks = (additionals.isDrinks()) ? "drinks, " : "";
        String chips = (additionals.isChips()) ? "chips, " : "";
        String meat = (baseBurger.isMeat()) ? "meat, " : "";
        System.out.println("This hamburger has " + baseBurger.getBreadRollType() + ", "+ meat + drinks + chips);
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
