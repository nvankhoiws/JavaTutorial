package core.com.udemy.timbuchalka.section10_interface_abstract_inner.abstractClass;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    protected abstract void eating();

    protected abstract void breathing();

    public String getName() {
        return name;
    }
}
