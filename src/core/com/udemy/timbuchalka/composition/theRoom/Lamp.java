package core.com.udemy.timbuchalka.composition.theRoom;

import core.com.udemy.timbuchalka.composition.thePC.Dimension;

public class Lamp {
    private Dimension dimension;
    private int lengthOfPowerCord;
    private String color;
    private boolean on;

    public Lamp(Dimension dimension, int lengthOfPowerCord, String color, boolean on) {
        this.dimension = dimension;
        this.lengthOfPowerCord = lengthOfPowerCord;
        this.color = color;
        this.on = on;
    }

    public void turnOn(){
        this.on = true;
        System.out.println("This Lamp is turned ON");
    }

    public void turnOff(){
        this.on = false;
        System.out.println("This Lamp is turned OFF");
    }

    public Dimension getDimension() {
        return dimension;
    }

    public int getLengthOfPowerCord() {
        return lengthOfPowerCord;
    }

    public String getColor() {
        return color;
    }

    public boolean isOn() {
        return on;
    }
}
