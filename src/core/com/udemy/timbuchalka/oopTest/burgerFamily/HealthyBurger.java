package core.com.udemy.timbuchalka.oopTest.burgerFamily;

public class HealthyBurger extends Hamburger {
    private boolean broccoli;
    private double priceOfBroccoli = 5.0;
    private boolean binna;
    private double priceOfBinna = 6.0;

    public HealthyBurger() {
        super("Bread Rye Roll", false);
    }

    public void addThese(boolean lettuce, boolean tomato, boolean carrot, boolean cheese, boolean broccoli, boolean binna) {
        super.addThese(lettuce, tomato, carrot, cheese);
        setBroccoli(broccoli);
        setBinna(binna);
    }

    public void addMeat(){
        setMeat(true);
    }

    @Override
    public double getGrantPrice() {
        return super.getBasePrice() + getAdditionalPrice();
    }

    @Override
    public void checkHamburger() {
        String lettuce = (isLettuce()) ? "lettuce, " : "";
        String tomato = (isTomato()) ? "tomato, " : "";
        String carrot = (isCarrot()) ? "carrot, " : "";
        String cheese = (isCheese()) ? "cheese, " : "";
        String meat = (isMeat()) ? "meat, " : "";
        String broccoli = (isBroccoli()) ? "broccoli, " : "";
        String binna = (isBinna()) ? "binna, " : "";
        System.out.println("This hamburger has " + getBreadRollType() + ", "+ meat + lettuce + tomato + carrot + cheese+broccoli+binna);
        System.out.println("This hamburger has base price is " + getBasePrice());
        System.out.println("This hamburger has additional price is " + getAdditionalPrice());
        System.out.println("This grant price of hamburger is " + getGrantPrice());
    }

    protected void setBroccoli(boolean broccoli) {
        if (isBroccoli()){
            this.broccoli = broccoli;
            if (!broccoli){
                setAdditionalPrice(getAdditionalPrice() - getPriceOfBroccoli());
            }
        } else {
            this.broccoli = broccoli;
            if (broccoli){
                setAdditionalPrice(getAdditionalPrice() + getPriceOfBroccoli());
            }
        }
    }

    protected void setBinna(boolean binna) {
        if (isBinna()){
            this.binna = binna;
            if (!binna){
                setAdditionalPrice(getAdditionalPrice() - getPriceOfBinna());
            }
        } else {
            this.binna = binna;
            if (binna){
                setAdditionalPrice(getAdditionalPrice() + getPriceOfBinna());
            }
        }
    }

    public boolean isBroccoli() {
        return broccoli;
    }

    public boolean isBinna() {
        return binna;
    }

    public double getPriceOfBroccoli() {
        return priceOfBroccoli;
    }

    public double getPriceOfBinna() {
        return priceOfBinna;
    }
}
