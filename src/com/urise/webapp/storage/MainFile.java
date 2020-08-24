package com.urise.webapp.storage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by iStyle on 19.08.2020.
 */
public class MainFile {
    public static void main(String[] args) {
        String filePath = ".\\.gitignore";

        File file = new File(filePath);
        try {
            System.out.println(file.getCanonicalPath());
        } catch (IOException e) {
            throw new RuntimeException("message", e);
        }


        File dir = new File("./src/com/urise/webapp");
        printDeeplyDirectory(dir, "   ");

        try(FileInputStream fis = new FileInputStream(filePath)) {
            System.out.println(fis.read());
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printDeeplyDirectory(File dir, String offset) {
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                System.out.println(offset + "F: " + file.getName());
            } else {
                System.out.println("D: " + file.getName());
                printDeeplyDirectory(file, offset);
            }
        }
    }
}
