package core.com.udemy.timbuchalka.composition.thePC;

public class Monitor {
    private String model;
    private String manufacturer;
    private Resolution resolution;

    public Monitor(String model, String manufacturer, Resolution resolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.resolution = resolution;
    }

    public void drawPicture(){
        System.out.println("Monitor.drawPicture()...");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Resolution getResolution() {
        return resolution;
    }
}
