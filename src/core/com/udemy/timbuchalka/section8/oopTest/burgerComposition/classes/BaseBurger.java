package core.com.udemy.timbuchalka.section8.oopTest.burgerComposition.classes;

public class BaseBurger {
    private String breadRollType;
    private double priceOfBread = 50;
    private boolean meat = true;
    private double priceOfMeat = 10;
    private double basePrice;

    public BaseBurger(String breadRollType) {
        this.breadRollType = breadRollType;
        this.basePrice = this.priceOfBread + this.priceOfMeat;
    }

    public void addMeat(boolean meat) {
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

    public String getBreadRollType() {
        return breadRollType;
    }

    public double getPriceOfBread() {
        return priceOfBread;
    }

    private void setPriceOfBread(double priceOfBread) {
        this.priceOfBread = priceOfBread;
    }

    public boolean isMeat() {
        return meat;
    }

    public double getPriceOfMeat() {
        return priceOfMeat;
    }

    private void setPriceOfMeat(double priceOfMeat) {
        this.priceOfMeat = priceOfMeat;
    }

    public double getBasePrice() {
        return basePrice;
    }
}
