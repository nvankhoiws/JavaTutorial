package core.com.udemy.timbuchalka.oopTest.burgerFamily;

public class Hamburger2 {
    private BaseBurger baseBurger;
    private Additionals additionals;

    public Hamburger2() {
        this.baseBurger = new BaseBurger(null);
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

    public void checkThisHamburger(){
        String lettuce = (additionals.isLettuce()) ? "lettuce, " : "";
        String tomato = (additionals.isTomato()) ? "tomato, " : "";
        String carrot = (additionals.isCarrot()) ? "carrot, " : "";
        String cheese = (additionals.isCheese()) ? "cheese, " : "";
        String meat = (baseBurger.isMeat()) ? "meat, " : "";
        System.out.println("This hamburger has " + baseBurger.getBreadRollType() + ", "+ meat + lettuce + tomato + carrot + cheese);
        System.out.println("This hamburger has base price is " + baseBurger.getBasePrice());
        System.out.println("This hamburger has additional price is " + additionals.getAdditionalPrice());
        System.out.println("This grant price of hamburger is " + getGrantPrice());
    }

    public static void main(String[] args) {
        Hamburger2 hamburger2 = new Hamburger2();
        System.out.println("\n");
        System.out.println(hamburger2.getGrantPrice());
        System.out.println(hamburger2.());
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