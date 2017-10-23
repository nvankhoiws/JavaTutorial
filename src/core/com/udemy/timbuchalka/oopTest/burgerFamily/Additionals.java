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

    public void addTomato(boolean tomato) {
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

    public void addCarrot(boolean carrot) {
        if (isCarrot()){
            this.carrot = carrot;
            if (!carrot){
                this.additionalPrice -= getPriceOfCarrot();
            }
        } else {
            this.carrot= carrot;
            if (carrot){
                this.additionalPrice += getPriceOfCarrot();
            }
        }
    }

    public void addCheese(boolean cheese) {
        if (isCheese()){
            this.cheese = cheese;
            if (!cheese){
                this.additionalPrice -= getPriceOfCheese();
            }
        } else {
            this.cheese= cheese;
            if (cheese){
                this.additionalPrice += getPriceOfCheese();
            }
        }
    }

    public void addBroccoli(boolean broccoli) {
        if (isCarrot()){
            this.broccoli = broccoli;
            if (!broccoli){
                this.additionalPrice -= getPriceOfBroccoli();
            }
        } else {
            this.broccoli= broccoli;
            if (broccoli){
                this.additionalPrice += getPriceOfBroccoli();
            }
        }
    }

    public void addBinna(boolean binna) {
        if (isCarrot()){
            this.binna = binna;
            if (!binna){
                this.additionalPrice -= getPriceOfBinna();
            }
        } else {
            this.binna= binna;
            if (binna){
                this.additionalPrice += getPriceOfBinna();
            }
        }
    }

    public void addChips(boolean chips) {
        if (isCarrot()){
            this.chips = chips;
            if (!chips){
                this.additionalPrice -= getPriceOfChips();
            }
        } else {
            this.chips= chips;
            if (chips){
                this.additionalPrice += getPriceOfChips();
            }
        }
    }

    public void addDrinks(boolean drinks) {
        if (isCarrot()){
            this.drinks = drinks;
            if (!drinks){
                this.additionalPrice -= getPriceOfDrinks();
            }
        } else {
            this.drinks= drinks;
            if (drinks){
                this.additionalPrice += getPriceOfDrinks();
            }
        }
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
