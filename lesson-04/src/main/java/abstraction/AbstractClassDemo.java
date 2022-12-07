package abstraction;

// Abstraction: Tính trừu tượng
// 1. Sử dụng abstract class
// - Không thể khởi tạo đối tượng
// - Ủy quyền triển khai method cho class con
// - Abstract class có tính trừu tượng <= 100%
// - Abstract class có thể kế thừa từ abstract class
public class AbstractClassDemo {
    public static void main(String[] args) {
        Dog dog = new Dog(1, "Dog");
        dog.makeSound();

        // - Không thể khởi tạo đối tượng
        // Animal animal = new Animal(2, "Animal");
    }
}
