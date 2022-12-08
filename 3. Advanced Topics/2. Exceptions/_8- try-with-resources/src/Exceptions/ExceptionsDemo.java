package Exceptions;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show() {
        sayHello();
    }

    public static void sayHello() {
        try (FileReader fileReader = new FileReader("file.txt");
             FileWriter fileWriter = new FileWriter("...")) {
            int value = fileReader.read();
            new SimpleDateFormat().parse("");
            fileWriter.write(15);
        } catch (IOException | ParseException e) {
            System.out.println("Could not read data.");
        }
    }
}
