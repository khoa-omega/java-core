package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;

public class IODemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "abc.txt";

        writeFile(path, "Java core", false);
        readFile(path);

        System.out.println();

        Car car = new Car(1, "BMW", "Red");
        writeObject(path, car, false);
        readObject(path);
    }

    public static void readObject(String path) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Car car = (Car) ois.readObject();
        System.out.println("car = " + car);
        ois.close();
        fis.close();
    }

    public static void writeObject(String path, Object object, boolean append) throws IOException {
        FileOutputStream fos = new FileOutputStream(path, append);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(object);
        oos.close();
        fos.close();
    }

    public static void readFile(String path) throws IOException {
        FileInputStream fis = new FileInputStream(path);
        byte[] buffer = new byte[1024];
        int length = fis.read(buffer);
        while (length != -1) {
            String s = new String(buffer, 0, length);
            System.out.print(s);
            length = fis.read(buffer);
        }
        fis.close();
    }

    public static void writeFile(String path, String content, boolean append) throws IOException {
        FileOutputStream fos = new FileOutputStream(path, append);
        fos.write(content.getBytes(StandardCharsets.UTF_8));
        fos.close();
    }
}
