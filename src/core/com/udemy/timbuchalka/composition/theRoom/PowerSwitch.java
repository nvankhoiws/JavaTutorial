package core.com.udemy.timbuchalka.composition.theRoom;

public class PowerSwitch {
    private String color;
    private int powerPlace;
    private String material;
    private int switchNumber;
    private boolean on;

    public PowerSwitch(String color, int powerPlace, String material, int switchNumber, boolean on) {
        this.color = color;
        this.powerPlace = powerPlace;
        this.material = material;
        this.switchNumber = switchNumber;
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

    public int getSwitchNumber() {
        return switchNumber;
    }
}
