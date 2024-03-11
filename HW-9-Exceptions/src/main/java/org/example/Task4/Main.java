package org.example.Task4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("source.txt", true);
        fileWriter.write("Вместе весело шагать по просторам! \n");
        fileWriter.write("По просторам!\n");
        fileWriter.write("И, конечно, припевать лучше хором!\n");
        fileWriter.write("Лучше хором, лучше хором!\n");
        fileWriter.close();

        copyFileContent("source.txt","dest.txt");
    }

    public static void copyFileContent(String sourcePath, String targetPath) {
        try (FileReader fileReader = new FileReader(sourcePath);
             FileWriter fileWriter = new FileWriter(targetPath, true)) {
            while (fileReader.ready()) {
                int symbol= fileReader.read();
                fileWriter.write(symbol);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
