package core.com.udemy.timbuchalka.section8.polymorphism;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 10/17/201711:50 AM.
 */
class Car {
    private String model;
    private boolean engine;
    private int wheels;
    private int speed;

    public Car(String model) {
        this.model = model;
        this.engine = true;
        this.wheels = 4;
        this.speed = 0;
    }

    public void startEngine() {
        System.out.println("Car.startEngine()...at speed of " + getSpeed() + " km/h");
        setSpeed(getSpeed() + 1);
    }

    public void accelerate(int speed) {
        setSpeed(getSpeed() + speed);
        System.out.println("Car accelerates to speed of " + getSpeed() + " km/h");
    }

    public void brake() {
        setSpeed(0);
        System.out.println("Car stops");
    }

    public String getModel() {
        System.out.println("Car is " + this.model);
        return model;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSpeed() {
        return speed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

class KiaMorning extends Car {
    public KiaMorning() {
        super("KiaMorning");
    }

    @Override
    public void startEngine() {
        setSpeed(2);
        System.out.println("KiaMorning.startEngine()...at speed of " + getSpeed() + " km/h");
    }
}

class Grandi10 extends Car {
    public Grandi10() {
        super("Grandi10");
    }

    @Override
    public void startEngine() {
        setSpeed(7);
        System.out.println("Grandi10.startEngine()...at speed of " + getSpeed() + " km/h");
    }
}

class Vios extends Car {
    public Vios() {
        super("Vios");
    }

    @Override
    public void startEngine() {
        setSpeed(10);
        System.out.println("Vios.startEngine()...at speed of " + getSpeed() + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = randomCar();
        car.getModel();
        car.startEngine();
    }

    public static Car randomCar() {
        int i = (int) (Math.random() * 3) + 1;
        switch (i){
            case 1:
                return new KiaMorning();
            case 2:
                return new Grandi10();
            case 3:
                return new Vios();
            default:
                return null;
        }
    }

}
