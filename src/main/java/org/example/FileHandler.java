package org.example;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;

public class FileHandler {

    public static void writeData(ArrayList<Toy> list, Path pathWrite) throws IOException {
        try (FileWriter writer = new FileWriter(String.valueOf(pathWrite), true)) {
            writer.write(list + "\n");
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом");
        }
    }

}
