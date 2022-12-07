package abstraction;

// Interface: Trừu tượng 100%
// Method: Mặc định phạm vi truy cập là public abstract
// Property: public static final
// Từ khóa: implements
// Hỗ trợ đa kế thừa
public class InterfaceDemo {
    public static void main(String[] args) {
        Bird bird = new Bird(1, "Bird");
        bird.makeSound();
        bird.fly();
        bird.jump();
    }
}
