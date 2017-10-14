package core.com.udemy.timbuchalka.inheritance;

public class Car extends Vehicle{
    private int gear;

    public Car(int steering, int speed, int gear) {
        super(steering, speed);
        this.gear = gear;
    }

    @Override
    public void increaseSpeed(int speed) {
        System.out.println("This Car is changing speed by +" + speed);
        super.increaseSpeed(speed);
    }

    @Override
    public void descreaseSpeed(int speed) {
        System.out.println("This Car is changing speed by -" + speed);
        super.descreaseSpeed(speed);
    }

    public void increaseGear (int gear) {
        if (gear > 0 && gear <= (6 - this.gear)) {
            this.gear += gear;
            System.out.println("This car is changing gear by +" + gear);
        }
    }

    public void decreaseGear (int gear) {
        if (gear > 0 && gear <= this.gear) {
            this.gear -= gear;
            System.out.println("This car is changing gear by -" + gear);
        }
    }

    public int getGear() {
        return gear;
    }

    public static void main(String[] args) {
        Car nissan = new Car(1,0,0);
        nissan.increaseGear(3);
        nissan.increaseSpeed(30);
        System.out.println("Gear of this car " + nissan.getGear());
        System.out.println("Speed of this car " + nissan.getSpeed());
    }

}
