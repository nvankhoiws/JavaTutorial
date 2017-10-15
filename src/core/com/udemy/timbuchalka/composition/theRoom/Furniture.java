package core.com.udemy.timbuchalka.composition.theRoom;

import core.com.udemy.timbuchalka.composition.thePC.Dimension;

public class Furniture {
    private String name;
    private String model;
    private String manufacturer;
    private String color;
    private String material;
    private Dimension dimension;

    public Furniture(String name, String model, String manufacturer, String color, String material, Dimension dimension) {
        this.name = name;
        this.model = model;
        this.manufacturer = manufacturer;
        this.color = color;
        this.material = material;
        this.dimension = dimension;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }
}
