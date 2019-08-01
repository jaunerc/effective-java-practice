package ch.travbit.practice.ej.chapter2.item9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * [item 9: Prefer try-with-resources to try-finally]
 *
 * This class represents a small app that reads the first line of a file.
 */
public class FileReadApp {

    private FileReadApp() {
    }

    public void readFirstLine(String path) {
        // try-with-resources doesn't need a finally block to close the resources
        // this is done automatically.
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String path = FileReadApp.class.getClassLoader()
                .getResource("chapter2/item9/some_text.txt").getPath();

        FileReadApp app = new FileReadApp();
        app.readFirstLine(path);
    }
}
