package core.com.udemy.timbuchalka.section8.composition.theRoom;

import core.com.udemy.timbuchalka.section8.composition.thePC.Dimension;

public class Blanket extends Furniture {
    private int peopleNumber;

    public Blanket(String name, String model, String manufacturer, String color, String material, Dimension dimension, int peopleNumber) {
        super(name, model, manufacturer, color, material, dimension);
        this.peopleNumber = peopleNumber;
    }

    public int getPeopleNumber() {
        return peopleNumber;
    }

    public void setPeopleNumber(int peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    public void isUsed(){
        if (peopleNumber < 1)
            System.out.println("It is not used");
        else
            System.out.println("It is using");
    }
}
