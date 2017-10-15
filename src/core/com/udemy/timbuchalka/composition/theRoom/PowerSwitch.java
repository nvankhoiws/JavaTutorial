package core.com.udemy.timbuchalka.composition.theRoom;

public class PowerSwitch {
    private String color;
    private int powerPlace;
    private String material;
    private boolean on;

    public PowerSwitch(String color, int powerPlace, String material, boolean on) {
        this.color = color;
        this.powerPlace = powerPlace;
        this.material = material;
        this.on = on;
    }

    public void turnOn(){
        this.on = true;
    }

    public String getColor() {
        return color;
    }

    public int getPowerPlace() {
        return powerPlace;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isOn() {
        return on;
    }
}
