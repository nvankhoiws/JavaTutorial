package core.com.udemy.timbuchalka.oopTest.burgerFamily;

public class Hamburger {
    private String breadRollType;
    private double priceOfBread = 50;
    private boolean meat = false;
    private double priceOfMeat = 10;

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

    public Hamburger(String breadRollType, boolean meat) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        if (isMeat()){
            this.basePrice = getPriceOfBread() + getPriceOfMeat();
        } else {
            this.basePrice = getPriceOfBread();
        }
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
        String meat = (isMeat()) ? "meat, " : "";
        System.out.println("This hamburger has " + getBreadRollType() + ", "+ meat + lettuce + tomato + carrot + cheese);
        System.out.println("This hamburger has base price is " + getBasePrice());
        System.out.println("This hamburger has additional price is " + getAdditionalPrice());
        System.out.println("This grant price of hamburger is " + getGrantPrice());
    }

    protected void setMeat(boolean meat) {
        if (isMeat()){
            this.meat = meat;
            if (!meat){
                this.basePrice -= getPriceOfMeat();
            }
        } else {
            this.meat = meat;
            if (meat){
                this.basePrice += getPriceOfMeat();
            }
        }
    }

    protected void setLettuce(boolean lettuce) {
        if (isLettuce()){
            this.lettuce = lettuce;
            if (!lettuce){
                this.additionalPrice -= getPriceOfLettuce();
            }
        } else {
            this.lettuce = lettuce;
            if (lettuce){
                this.additionalPrice += getPriceOfLettuce();
            }
        }
    }

    protected void setTomato(boolean tomato) {
        if (isTomato()){
            this.tomato = tomato;
            if (!tomato){
                this.additionalPrice -= getPriceOfTomato();
            }
        } else {
            this.tomato = tomato;
            if (tomato){
                this.additionalPrice += getPriceOfTomato();
            }
        }
    }

    protected void setCarrot(boolean carrot) {
        if (isCarrot()){
            this.carrot = carrot;
            if (!carrot){
                this.additionalPrice -= getPriceOfCarrot();
            }
        } else {
            this.carrot = carrot;
            if (carrot){
                this.additionalPrice += getPriceOfCarrot();
            }
        }
    }

    protected void setCheese(boolean cheese) {
        if (isCheese()){
            this.cheese = cheese;
            if (!cheese){
                this.additionalPrice -= getPriceOfCheese();
            }
        } else {
            this.cheese = cheese;
            if (cheese){
                this.additionalPrice += getPriceOfCheese();
            }
        }
    }

    protected void setAdditionalPrice(double additionalPrice) {
        this.additionalPrice = additionalPrice;
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
