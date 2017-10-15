package core.com.udemy.timbuchalka.composition.theRoom;

import core.com.udemy.timbuchalka.composition.thePC.Dimension;

public class Bed extends Furniture {
    private int peopleNumber;
    private Blanket blanket;
    private boolean hasBlanket;

    public Bed(String name, String model, String manufacturer, String color, String material, Dimension dimension, int peopleNumber, Blanket blanket, boolean hasBlanket) {
        super(name, model, manufacturer, color, material, dimension);
        this.peopleNumber = peopleNumber;
        this.blanket = blanket;
        this.hasBlanket = hasBlanket;
    }

    public void cleanedToday(boolean bol){
        if (bol)
            System.out.println("Bed is cleaned today");
        else
            System.out.println("Bed is not cleaned yet");
    }

    public void peopleGoToSleep(){
        if (getPeopleNumber() > 0){
            System.out.println("People are sleeping...");
        } else {
            System.out.println("People are wake up and working");
        }
    }

    public int getPeopleNumber() {
        return peopleNumber;
    }

    public void setPeopleNumber(int peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    public Blanket getBlanket() {
        return blanket;
    }

    public void setBlanket(Blanket blanket) {
        this.blanket = blanket;
    }

    public boolean isHasBlanket() {
        return hasBlanket;
    }

    public void setHasBlanket(boolean hasBlanket) {
        this.hasBlanket = hasBlanket;
    }
}
