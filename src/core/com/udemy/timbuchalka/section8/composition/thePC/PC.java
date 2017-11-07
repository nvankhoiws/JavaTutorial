package core.com.udemy.timbuchalka.section8.composition.thePC;

public class PC {
    private Monitor theMonitor;
    private Case theCase;
    private MotherBoard theMotherBoard;
    private String retailer;

    public PC(Monitor theMonitor, Case theCase, MotherBoard theMotherBoard, String retailer) {
        this.theMonitor = theMonitor;
        this.theCase = theCase;
        this.theMotherBoard = theMotherBoard;
        this.retailer = retailer;
    }

    public void turnOn(){
        getTheCase().powerUp();
        getTheMotherBoard().loadProgram();
        getTheMonitor().drawPicture();
    }

    public Monitor getTheMonitor() {
        return theMonitor;
    }

    public Case getTheCase() {
        return theCase;
    }

    public MotherBoard getTheMotherBoard() {
        return theMotherBoard;
    }

    public String getRetailer() {
        return retailer;
    }
}
