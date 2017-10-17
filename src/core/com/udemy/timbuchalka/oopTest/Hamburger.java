package core.com.udemy.timbuchalka.oopTest;

public class Hamburger {
    private String breadRollType;
    private double priceOfBread;
    private boolean meat;
    private double priceOfMeat;

    private boolean lettuce;
    private double priceOfLettuce = 1;
    private boolean tomato;
    private double priceOfTomato = 2;
    private boolean carrot;
    private double priceOfCarrot = 3;
    private boolean cheese;
    private double priceOfCheese = 4;

    private double basePrice;
    private double additionalPrice=0;

    public Hamburger(String breadRollType, boolean meat, double basePrice) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = basePrice;
    }

    public void addThese(boolean lettuce, boolean tomato, boolean carrot, boolean cheese) {
        setLettuce(lettuce);
        setTomato(tomato);
        setCarrot(carrot);
        setCheese(cheese);
    }

    public double getGrantPrice(){
        return getBasePrice() + getAdditionalPrice();
    }

    public void checkHamburger() {
        String lettuce = (isLettuce()) ? "lettuce, " : "";
        String tomato = (isTomato()) ? "tomato, " : "";
        String carrot = (isCarrot()) ? "carrot, " : "";
        String cheese = (isCheese()) ? "cheese, " : "";
        System.out.println("This hamburger has " + getBreadRollType() + " bread roll, meat, " + lettuce + tomato + carrot + cheese);
        System.out.println("This price of hamburger is " + getGrantPrice());
    }

    private void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
        if (this.lettuce) this.additionalPrice += getPriceOfLettuce();
    }

    private void setTomato(boolean tomato) {
        this.tomato = tomato;
        if (this.tomato) this.additionalPrice += getPriceOfTomato();
    }

    private void setCarrot(boolean carrot) {
        this.carrot = carrot;
        if (this.carrot) this.additionalPrice += getPriceOfCarrot();
    }

    private void setCheese(boolean cheese) {
        this.cheese = cheese;
        if (this.cheese) this.additionalPrice += getPriceOfCheese();
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public double getPriceOfBread() {
        return priceOfBread;
    }

    public boolean isMeat() {
        return meat;
    }

    public double getPriceOfMeat() {
        return priceOfMeat;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public double getPriceOfLettuce() {
        return priceOfLettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public double getPriceOfTomato() {
        return priceOfTomato;
    }

    public boolean isCarrot() {
        return carrot;
    }

    public double getPriceOfCarrot() {
        return priceOfCarrot;
    }

    public boolean isCheese() {
        return cheese;
    }

    public double getPriceOfCheese() {
        return priceOfCheese;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getAdditionalPrice() {
        return additionalPrice;
    }
}
