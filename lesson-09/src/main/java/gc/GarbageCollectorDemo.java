package gc;

public class GarbageCollectorDemo {
    public static void main(String[] args) {
        // Khi nào bộ nhớ sẽ bị dọn?
        // 1. Khi đối tượng đó bị mất liên kết
        Animal animal = new Animal("Dog");
        animal = null;
        // 2. Biến cục bộ
        demo();

        // Dọn rác
        System.gc();
    }

    public static void demo() {
        Animal animal = new Animal("Cat");
    }
}
