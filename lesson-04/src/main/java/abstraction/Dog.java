package abstraction;

public class Dog extends Animal {
    public Dog(int id, String name) {
        super(id, name);
    }

    @Override
    public void makeSound() {
        System.out.println("Gâu Gâu.");
    }
}
