package core.com.udemy.timbuchalka.section10_interface_abstract_inner.abstractClass;

public class App {
    public static void main(String[] args) {
        Animal dog = new Dog("Scooby");
        dog.eating();
        dog.breathing();

        System.out.println();

        Bird aParrot = new Parrot("Bekie");
        aParrot.eating();
        aParrot.breathing();
        aParrot.fly();


        System.out.println();

        Bird penguin = new Penguin("Pengie");
        penguin.fly();
    }
}
