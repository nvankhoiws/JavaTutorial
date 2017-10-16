package core.com.udemy.timbuchalka.composition.theRoom;

import core.com.udemy.timbuchalka.composition.thePC.Dimension;

public class Bed extends Furniture {
    private int peopleNumberOnBed;
    private Blanket blanket;
    private boolean hasBlanket;
    private boolean cleaned;

    public Bed(String name, String model, String manufacturer, String color, String material, Dimension dimension, int peopleNumberOnBed, Blanket blanket, boolean hasBlanket, boolean cleaned) {
        super(name, model, manufacturer, color, material, dimension);
        this.peopleNumberOnBed = peopleNumberOnBed;
        this.blanket = blanket;
        this.hasBlanket = hasBlanket;
        this.cleaned = cleaned;
    }

    public void isCleanedToday(){
        if (isCleaned())
            System.out.println("Bed is cleaned today");
        else
            System.out.println("Bed is not cleaned yet");
    }

    public void isPeopleSleeping(){
        if (getPeopleNumberOnBed() > 0){
            System.out.println("People are sleeping...");
        } else {
            System.out.println("People are wake up and working");
        }
    }

    public boolean isCleaned() {
        return cleaned;
    }

    public int getPeopleNumberOnBed() {
        return peopleNumberOnBed;
    }

    public void setPeopleNumberOnBed(int peopleNumberOnBed) {
        this.peopleNumberOnBed = peopleNumberOnBed;
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
