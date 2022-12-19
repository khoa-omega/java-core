package frontend;

import utils.FileManager;

import java.io.IOException;

public class Program03 {
    public static void main(String[] args) throws IOException {
        String path = "abc.txt";

        boolean question01 = FileManager.isFileExists(path);
        System.out.println("question01 = " + question01);

        boolean question02 = FileManager.createNewFile(path);
        System.out.println("question02 = " + question02);

        boolean question04 = FileManager.deleteFile(path);
        System.out.println("question04 = " + question04);

        boolean question05 = FileManager.isFolder(path);
        System.out.println("question05 = " + question05);

        String[] question06 = FileManager.getAllFileName(".");
        for (String fileName : question06) {
            System.out.println("    - " + fileName);
        }

        FileManager.copyFile("./README.md", "./assignment-07/README.md");
    }
}
