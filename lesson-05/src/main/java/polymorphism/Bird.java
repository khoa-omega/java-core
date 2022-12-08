package polymorphism;

public class Bird extends Animal implements Flyable {
    public Bird(int id, String name) {
        super(id, name);
    }

    @Override
    public void makeSound() {
        System.out.println("Chíp chíp");
    }

    @Override
    public void fly() {
        System.out.println("Bird can fly");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
