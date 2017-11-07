package core.com.udemy.timbuchalka.section8.composition.theRoom;

import core.com.udemy.timbuchalka.section8.composition.thePC.Dimension;

public class Desk {
    private Dimension dimension;
    private String material;
    private int legs;
    private String color;

    public Desk(Dimension dimension, String material, int legs, String color) {
        this.dimension = dimension;
        this.material = material;
        this.legs = legs;
        this.color = color;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public String getMaterial() {
        return material;
    }

    public int getLegs() {
        return legs;
    }

    public String getColor() {
        return color;
    }
}
