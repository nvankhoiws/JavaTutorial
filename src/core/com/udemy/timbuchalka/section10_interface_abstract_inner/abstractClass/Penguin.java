package core.com.udemy.timbuchalka.section10_interface_abstract_inner.abstractClass;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I am just flapping my swing but I cannot fly.");
    }
}
