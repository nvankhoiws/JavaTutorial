package core.com.udemy.timbuchalka.oopTest.burgerFamily;

public class HealthyBurger extends Hamburger {
    private boolean broccoli;
    private double priceOfBroccoli = 5.0;
    private boolean binna;
    private double priceOfBinna = 6.0;
    private double additionalPrice=0;

    public HealthyBurger(String breadRollType) {
        super(breadRollType, false);
    }

    protected void setBroccoli(boolean broccoli) {
        if (isBroccoli()){
            this.broccoli = broccoli;
            if (!broccoli){
                this.additionalPrice = super.getAdditionalPrice() + getAdditionalPrice() - getPriceOfBroccoli() ;
            }
        } else {
            this.broccoli = broccoli;
            if (broccoli){
                this.additionalPrice = super.getAdditionalPrice() + getAdditionalPrice() + getPriceOfBroccoli();
            }
        }
    }

    protected void setBinna(boolean binna) {
        if (isBinna()){
            this.binna = binna;
            if (!binna){
                this.additionalPrice = super.getAdditionalPrice() + getAdditionalPrice() - getPriceOfBinna() ;
            }
        } else {
            this.binna = binna;
            if (binna){
                this.additionalPrice = super.getAdditionalPrice() + getAdditionalPrice() + getPriceOfBinna() ;
            }
        }
    }

    public boolean isBroccoli() {
        return broccoli;
    }

    public boolean isBinna() {
        return binna;
    }

    @Override
    public double getAdditionalPrice() {
        return additionalPrice;
    }

    public double getPriceOfBroccoli() {
        return priceOfBroccoli;
    }

    public double getPriceOfBinna() {
        return priceOfBinna;
    }
}
