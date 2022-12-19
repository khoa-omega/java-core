package file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("createNewFile() = " + createNewFile());
    }

    public static boolean createNewFile() throws IOException {
        File file = new File("abc.txt");
        return file.createNewFile();
    }
}
