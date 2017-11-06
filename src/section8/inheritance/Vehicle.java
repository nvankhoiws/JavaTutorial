package core.com.udemy.timbuchalka.section8.inheritance;

public class Vehicle {
    private int steering;
    private int speed;

    public Vehicle(int steering, int speed) {
        this.steering = steering;
        this.speed = speed;
    }

    public void increaseSpeed(int speed){
        if (speed > 0) {
            this.speed += speed;
            System.out.println("This vihicle increases speed to " + this.speed);
        }
    }

    public void descreaseSpeed(int speed){
        if (speed > 0 && speed <= this.speed) {
            this.speed -= speed;
            System.out.println("This vihicle decreases speed to " + this.speed);
        }
    }

    public int getSteering() {
        return steering;
    }

    public int getSpeed() {
        return speed;
    }
}
