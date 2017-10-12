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
}
