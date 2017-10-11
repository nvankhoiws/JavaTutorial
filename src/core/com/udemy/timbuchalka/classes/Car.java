package core.com.udemy.timbuchalka.classes;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 10/11/20172:26 PM.
 */
public class Car {
    private String model;
    private String manufacturer;
    private String color;
    private Integer weight;
    private Integer power;
    private Integer doors;
    private Integer wheels;
    private String engine;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        if (manufacturer.equalsIgnoreCase("nissan")
                || manufacturer.equalsIgnoreCase("toyota")) {
            this.manufacturer = manufacturer;
        } else {
            this.manufacturer = "not-produced-in-asia";
        }
    }
}