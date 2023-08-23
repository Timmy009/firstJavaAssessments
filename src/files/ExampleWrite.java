package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class ExampleWrite {
    public static void main(String[] args) {
        String location = "//home//user//Documents//javaLink//index.txt";
        Path path = Paths.get(location);




        try (
                BufferedWriter writer = Files.newBufferedWriter(path)){
            writer.write("Joy likes mango ");


        }
        catch (IOException exception) {
            System.err.println(exception.getMessage());

        }

    }
}
