package gc;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() {
        System.out.println(name + " đã bị dọn rác.");
    }
}
