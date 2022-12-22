package backend;

import entity.MyMap;

public class Exercise03 {
    public static <T> void print(T a) {
        System.out.println("a = " + a);
    }

    public static <E extends Number> void showArray(E[] array) {
        for (E e : array) {
            System.out.println("e = " + e);
        }
    }

    public static void question06() {
        MyMap<Integer, String> student = new MyMap<>(1, "Duy");
        System.out.println("student.getKey() = " + student.getKey());
        System.out.println("student.getValue() = " + student.getValue());
    }
}
