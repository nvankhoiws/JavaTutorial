package core.com.udemy.timbuchalka.section10_interface_abstract_inner.abstractClass;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    protected void eating() {
        System.out.println("The dog " + getName() + " is eating");
    }

    @Override
    protected void breathing() {
        System.out.println("The dog is breathing");
    }
}
