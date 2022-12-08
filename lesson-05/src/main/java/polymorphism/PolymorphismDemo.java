package polymorphism;

// Polymorphism: Tính đa hình
// Giống ép kiểu dữ liệu dạng widening
// instanceof: Kiểm tra đối tượng thuộc class nào
public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal dog = new Dog(1, "Dog");
        System.out.println("dog = " + dog);
        makeSound(dog);

        Animal bird = new Bird(2, "Bird");
        System.out.println("bird = " + bird);
        makeSound(bird);

        Animal[] animals = {dog, bird};
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                System.out.println(animal.getName() + " is dog.");
            } else if (animal instanceof Bird) {
                System.out.println(animal.getName() + " is bird.");
            }
        }
    }

    public static void makeSound(Animal animal) {
        animal.makeSound();
    }
}
