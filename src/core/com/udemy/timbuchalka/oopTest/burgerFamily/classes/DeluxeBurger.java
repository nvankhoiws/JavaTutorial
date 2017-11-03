package core.com.udemy.timbuchalka.oopTest.burgerFamily.classes;

public class DeluxeBurger extends Hamburger {
    private boolean chips;
    private boolean drinks;
    private double priceOfChips = 7;
    private double priceOfDrinks = 8;

    public DeluxeBurger() {
        super("Deluxe Burger Bread Roll", true);
        super.addThese(false, false, false, false);
        setChips(true);
        setDrinks(true);
    }

    public void addThese(boolean chips, boolean drinks) {
        setChips(chips);
        setDrinks(drinks);
    }

    @Override
    public double getGrantPrice() {
        return getBasePrice() + getAdditionalPrice();
    }

    @Override
    public void checkHamburger() {
        String chips = (isChips()) ? "chips, " : "";
        String drinks = (isDrinks()) ? "drinks, " : "";
        System.out.println("This hamburger has " + getBreadRollType() + ", "+ chips + drinks);
        System.out.println("This hamburger has base price is " + getBasePrice());
        System.out.println("This hamburger has additional price is " + getAdditionalPrice());
        System.out.println("This grant price of hamburger is " + getGrantPrice());
    }
    private void setChips(boolean chips) {
        if (isChips()){
            this.chips = chips;
            if (!chips){
                super.setAdditionalPrice(super.getAdditionalPrice() - getPriceOfChips());
            }
        } else {
            this.chips = chips;
            if (chips){
                super.setAdditionalPrice(super.getAdditionalPrice() + getPriceOfChips());
            }
        }
    }

    private void setDrinks(boolean drinks) {
        if (isDrinks()){
            this.drinks = drinks;
            if (!drinks){
                super.setAdditionalPrice(super.getAdditionalPrice() - getPriceOfDrinks());
            }
        } else {
            this.drinks = drinks;
            if (drinks){
                super.setAdditionalPrice(super.getAdditionalPrice() + getPriceOfDrinks());
            }
        }
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
}
