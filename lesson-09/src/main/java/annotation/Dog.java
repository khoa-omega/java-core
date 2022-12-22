package annotation;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Gâu Gâu");
    }

    @Override
    @SuppressWarnings("deprecation")
    public void eat() {
        super.eat();
    }
}
