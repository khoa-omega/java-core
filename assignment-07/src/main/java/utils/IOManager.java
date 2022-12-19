package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;

public class IOManager {
    public static final String OBJECT_IS_NULL = "Error! Object is null.";

    public static Object readObject(String path) throws IOException, ClassNotFoundException {
        if (!FileManager.isFileExists(path)) {
            throw new IllegalStateException(FileManager.FILE_NOT_EXIST);
        }
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object object = ois.readObject();
        ois.close();
        fis.close();
        return object;
    }

    public static void writeObject(String path, Object object, boolean append) throws IOException {
        if (object == null) {
            throw new IllegalStateException(OBJECT_IS_NULL);
        }
        if (!FileManager.isFileExists(path)) {
            throw new IllegalStateException(FileManager.FILE_NOT_EXIST);
        }
        FileOutputStream fos = new FileOutputStream(path, append);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(object);
        oos.close();
        fos.close();
    }

    public static String readFile(String path) throws IOException {
        if (!FileManager.isFileExists(path)) {
            throw new IllegalStateException(FileManager.FILE_NOT_EXIST);
        }
        FileInputStream fis = new FileInputStream(path);
        byte[] buffer = new byte[1024];
        int length = fis.read(buffer);
        String content = "";
        while (length != -1) {
            content += new String(buffer, 0, length);
            length = fis.read(buffer);
        }
        fis.close();
        return content;
    }

    public static void writeFile(String path, String content, boolean append) throws IOException {
        if (!FileManager.isFileExists(path)) {
            throw new IllegalStateException(FileManager.FILE_NOT_EXIST);
        }
        FileOutputStream fos = new FileOutputStream(path, append);
        fos.write(content.getBytes(StandardCharsets.UTF_8));
        fos.close();
    }
}
