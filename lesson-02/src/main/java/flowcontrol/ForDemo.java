package flowcontrol;

public class ForDemo {
    public static void main(String[] args) {
        String[] fruits = {"Cam", "Lê", "Táo"};
        // min = 0, max = length - 1

        System.out.println("----------- FOR INDEX -----------");
        for (int i = 0; i < fruits.length; i = i + 1) {
            System.out.println("fruits[" + i + "] = " + fruits[i]);
        }

        System.out.println("----------- FOR EACH -----------");
        for (String fruit : fruits) {
            System.out.println("fruit = " + fruit);
        }
    }
}
