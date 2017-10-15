package core.com.udemy.timbuchalka.composition.theRoom;

import core.com.udemy.timbuchalka.composition.thePC.Dimension;

public class Picture {
    private Dimension dimension;
    private String material;
    private String name;
    private int year;

    public Picture(Dimension dimension, String material, String name, int year) {
        this.dimension = dimension;
        this.material = material;
        this.name = name;
        this.year = year;
    }

    public Dimension getDimension2D() {
        return dimension;
    }

    public String getMaterial() {
        return material;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void isHanged(){
        System.out.println("It is hanging");
    }
}
