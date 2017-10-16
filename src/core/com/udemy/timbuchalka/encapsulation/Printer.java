package core.com.udemy.timbuchalka.encapsulation;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 10/16/20175:46 PM.
 */
public class Printer {
    private int tonerLevel;
    private int accumulativePagePrinted = 1000;
    private int currentPagePrinted;
    private boolean duplexPriting;

    public Printer(int tonerLevel, int accumulativePagePrinted, boolean duplexPriting) {
        if (tonerLevel > 0 && tonerLevel <=100) {
            this.tonerLevel = tonerLevel;
        } else if (tonerLevel <= 0) {
            this.tonerLevel = 0;
        } else {
            this.tonerLevel = 100;
        }
        if (accumulativePagePrinted > 0 && accumulativePagePrinted <= 1000) {
            this.accumulativePagePrinted = 1000;
        } else if (accumulativePagePrinted <= 0) {
            this.accumulativePagePrinted = 0;
        } else {
            this.accumulativePagePrinted = accumulativePagePrinted;
        }
        this.duplexPriting = duplexPriting;
    }

    public void fillUpToner(int percent){
        if (percent > 0 && percent <= 100 - this.tonerLevel) {
            this.tonerLevel = this.tonerLevel + percent;
            System.out.println("Printer is filled up to " + this.tonerLevel + "%");
        } else if (percent > 0 && percent > 100 - this.tonerLevel) {
            this.tonerLevel = 100;
            System.out.println("Printer is filled up to 100%");
        } else {
            this.tonerLevel = 0;
            System.out.println("Printer is emptied out");
        }
    }

    public int getTonerLevel() {
        if (this.tonerLevel <= 0) {
            System.out.println("Printer is emptied out");
        } else {
            System.out.println("Printer is remained at " + this.tonerLevel + "%");
        }
        return tonerLevel;
    }

    public int getAccumulativePagePrinted() {
        return accumulativePagePrinted;
    }

    public int getCurrentPagePrinted() {
        return currentPagePrinted;
    }

    public boolean isDuplexPriting() {
        return duplexPriting;
    }
}
