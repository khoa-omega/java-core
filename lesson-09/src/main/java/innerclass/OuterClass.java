package innerclass;

public class OuterClass {
    private static int id;

    public static class InnerClass {
        private String name;

        public InnerClass() {
        }

        public void showInfo() {
            System.out.println("Outer class: id = " + id);
            System.out.println("Inner class: name = " + name);
        }
    }
}
