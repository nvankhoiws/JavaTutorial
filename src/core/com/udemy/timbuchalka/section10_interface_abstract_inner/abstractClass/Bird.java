package core.com.udemy.timbuchalka.section10_interface_abstract_inner.abstractClass;

public abstract class Bird extends Animal implements CanFly {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eating() {
        System.out.println("The bird " + getName() + " is peaking");
    }

    @Override
    public void breathing() {
        System.out.println("The bird is breathing");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping the swings.");
    }
}