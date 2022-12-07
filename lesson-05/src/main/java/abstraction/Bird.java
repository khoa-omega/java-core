package abstraction;

public class Bird extends Animal implements Flyable, Jumpable {
    public Bird(int id, String name) {
        super(id, name);
    }

    @Override
    public void makeSound() {
        System.out.println("Líu lo");
    }

    @Override
    public void fly() {
        System.out.println("Bird can fly");
    }

    @Override
    public void jump() {
        System.out.println("Bird can jump");
    }
}
