package core.com.udemy.timbuchalka.oopTest.burgerFamily;

public class Additionals {
    private boolean lettuce;
    private double priceOfLettuce = 1;
    private boolean tomato;
    private double priceOfTomato = 2;
    private boolean carrot;
    private double priceOfCarrot = 3;
    private boolean cheese;
    private double priceOfCheese = 4;
    private boolean broccoli;
    private double priceOfBroccoli = 5.0;
    private boolean binna;
    private double priceOfBinna = 6.0;
    private boolean chips;
    private double priceOfChips = 7.0;
    private boolean drinks;
    private double priceOfDrinks = 8.0;

    private double additionalPrice;


    public Additionals() {

    }

// Setter
    public void addLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    public void addTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public void addCarrot(boolean carrot) {
        this.carrot = carrot;
    }

    public void addCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public void addBroccoli(boolean broccoli) {
        this.broccoli = broccoli;
    }

    public void addBinna(boolean binna) {
        this.binna = binna;
    }

    public void addChips(boolean chips) {
        this.chips = chips;
    }

    public void addDrinks(boolean drinks) {
        this.drinks = drinks;
    }
//Getter
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

    public boolean isBroccoli() {
        return broccoli;
    }

    public double getPriceOfBroccoli() {
        return priceOfBroccoli;
    }

    public boolean isBinna() {
        return binna;
    }

    public double getPriceOfBinna() {
        return priceOfBinna;
    }

    public boolean isChips() {
        return chips;
    }

    public boolean isDrinks() {
        return drinks;
    }

    public double getPriceOfChips() {
        return priceOfChips;
    }

    public double getPriceOfDrinks() {
        return priceOfDrinks;
    }

    public double getAdditionalPrice() {
        return additionalPrice;
    }
}
