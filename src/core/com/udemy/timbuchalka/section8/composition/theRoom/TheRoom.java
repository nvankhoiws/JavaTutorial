package core.com.udemy.timbuchalka.section8.composition.theRoom;

public class TheRoom {
    private Bed bed;
    private Desk desk;
    private Lamp lamp;
    private Picture picture;
    private PowerSwitch powerSwitch;
    private int hourInDay;

    public TheRoom(Bed bed, Desk desk, Lamp lamp, Picture picture, PowerSwitch powerSwitch, int hourInDay) {
        this.bed = bed;
        this.desk = desk;
        this.lamp = lamp;
        this.picture = picture;
        this.powerSwitch = powerSwitch;
        this.hourInDay = hourInDay;
    }

    public void lampOnAutomatically () {
        getPowerSwitch().turnOn();
        if (getHourInDay() >= 18) {
            getLamp().turnOn();
        } else {
            getLamp().turnOff();
        }
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public Desk getDesk() {
        return desk;
    }

    public void setDesk(Desk desk) {
        this.desk = desk;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void setLamp(Lamp lamp) {
        this.lamp = lamp;
    }

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    public PowerSwitch getPowerSwitch() {
        return powerSwitch;
    }

    public void setPowerSwitch(PowerSwitch powerSwitch) {
        this.powerSwitch = powerSwitch;
    }

    public int getHourInDay() {
        return hourInDay;
    }

    public void setHourInDay(int hourInDay) {
        this.hourInDay = hourInDay;
    }
}
