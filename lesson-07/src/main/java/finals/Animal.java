package finals;

public class Animal {
    protected String name;

    public Animal(final String name) {
        this.name = name;
    }

    public final void eat() {
        System.out.println("Animal is eating...");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
