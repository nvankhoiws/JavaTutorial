package core.com.udemy.timbuchalka.encapsulation;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 10/16/20175:46 PM.
 */
public class Printer {
    private double tonerLevel;
    private int accumulativePagePrinted = 1000;
    private int currentPagePrinted;

    public Printer(double tonerLevel, int accumulativePagePrinted) {
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
    }

    public void fillUpToner(double percent){
        if (percent > 0 && percent <= 100 - this.tonerLevel) {
            this.tonerLevel = this.tonerLevel + percent;
            System.out.println("Toner is filled up to " + this.tonerLevel + "%");
        } else if (percent > 0 && percent > 100 - this.tonerLevel) {
            this.tonerLevel = 100;
            System.out.println("Toner is filled up to 100%");
        } else {
            this.tonerLevel = 0;
            System.out.println("Toner is not filled up yet");
        }
    }

    public double getTonerLevel() {
        if (this.tonerLevel <= 0) {
            System.out.println("Toner is emptied out");
        } else {
            System.out.println("Toner remains at " + this.tonerLevel + "%");
        }
        return tonerLevel;
    }

    public void printing(int pageNumber){
        System.out.println("Printer is printing...");
        System.out.println("================================Report================================");
        setTonerLevel(this.tonerLevel - pageNumber/250);
        System.out.println("Toner level remains at " + this.tonerLevel + "%");
        setCurrentPagePrinted(pageNumber);
        System.out.println("Pages are printed is " + pageNumber);
        setAccumulativePagePrinted(getAccumulativePagePrinted() + pageNumber);
        System.out.println("Accumulative page printed until now is " + getAccumulativePagePrinted());
    }

    public int getAccumulativePagePrinted() {
        return accumulativePagePrinted;
    }

    public int getCurrentPagePrinted() {
        return currentPagePrinted;
    }

    private void setTonerLevel(double tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    private void setAccumulativePagePrinted(int accumulativePagePrinted) {
        this.accumulativePagePrinted = accumulativePagePrinted;
    }

    private void setCurrentPagePrinted(int currentPagePrinted) {
        this.currentPagePrinted = currentPagePrinted;
    }
}
