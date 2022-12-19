package utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileManager {
    public static final String FILE_EXISTS = "Error! File Exist.";
    public static final String FILE_NOT_EXIST = "Error! File Not Exist.";
    public static final String PATH_NOT_FOLDER = "Error! Path is not folder.";
    public static final String SOURCE_NOT_EXIST = "Error! Source File Not Exist.";
    public static final String DESTINATION_EXISTS = "Error! newPath has File same name.";

    public static boolean isFileExists(String path) {
        File file = new File(path);
        return file.exists();
    }

    public static boolean createNewFile(String path) throws IOException {
        if (isFileExists(path)) {
            throw new IllegalStateException(FILE_EXISTS);
        }
        File file = new File(path);
        return file.createNewFile();
    }

    public static boolean deleteFile(String path) {
        if (!isFileExists(path)) {
            throw new IllegalStateException(FILE_NOT_EXIST);
        }
        File file = new File(path);
        return file.delete();
    }

    public static boolean isFolder(String path) {
        File file = new File(path);
        return file.isDirectory();
    }

    public static String[] getAllFileName(String path) {
        if (!isFolder(path)) {
            throw new IllegalStateException(PATH_NOT_FOLDER);
        }
        File file = new File(path);
        return file.list();
    }

    public static void copyFile(String source, String destination) throws IOException {
        if (!isFileExists(source)) {
            throw new IllegalStateException(SOURCE_NOT_EXIST);
        }
        if (isFileExists(destination)) {
            throw new IllegalStateException(DESTINATION_EXISTS);
        }
        Path from = Paths.get(source);
        Path to = Paths.get(destination);
        Files.copy(from, to);
    }

    public static boolean moveFile(String source, String destination) {
        if (!isFileExists(source)) {
            throw new IllegalStateException(SOURCE_NOT_EXIST);
        }
        if (isFileExists(destination)) {
            throw new IllegalStateException(DESTINATION_EXISTS);
        }
        File from = new File(source);
        File to = new File(destination);
        return from.renameTo(to);
    }

    public static boolean renameFile(String source, String destination) {
        if (!isFileExists(source)) {
            throw new IllegalStateException(SOURCE_NOT_EXIST);
        }
        if (isFileExists(destination)) {
            throw new IllegalStateException(DESTINATION_EXISTS);
        }
        File from = new File(source);
        File to = new File(destination);
        return from.renameTo(to);
    }

    public static boolean createNewFolder(String path) {
        File file = new File(path);
        return file.mkdirs();
    }
}
