package core.com.udemy.timbuchalka.oopTest.burgerComposition.classes;

public class Hamburger{
    private BaseBurger baseBurger;
    private Additionals additionals;

    public Hamburger(String breadRollType) {
        this.baseBurger = new BaseBurger(breadRollType);
        this.additionals = new Additionals();
    }

    public void addThese(boolean lettuce, boolean tomato, boolean carrot, boolean cheese){
            additionals.addLettuce(lettuce);
            additionals.addTomato(tomato);
            additionals.addCarrot(carrot);
            additionals.addCheese(cheese);
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
        String lettuce = (additionals.isLettuce()) ? "lettuce, " : "";
        String tomato = (additionals.isTomato()) ? "tomato, " : "";
        String carrot = (additionals.isCarrot()) ? "carrot, " : "";
        String cheese = (additionals.isCheese()) ? "cheese, " : "";
        String meat = (baseBurger.isMeat()) ? "meat, " : "";
        System.out.println("This hamburger has " + baseBurger.getBreadRollType() + ", "+ meat + lettuce + tomato + carrot + cheese);
        System.out.println("This hamburger has base price is " + baseBurger.getBasePrice());
        System.out.println("This hamburger has additional price is " + additionals.getAdditionalPrice());
        System.out.println("The grant price of hamburger is " + getGrantPrice());
    }

    public BaseBurger getBaseBurger() {
        return baseBurger;
    }

    public Additionals getAdditionals() {
        return additionals;
    }
}