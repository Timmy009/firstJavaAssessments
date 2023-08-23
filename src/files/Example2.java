package files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Example2 {
    public static void main(String[] args) {
        String location = "//home//user//Documents//javaLink//index.txt";
        Path path = Paths.get(location);

        System.out.println(path);
        char [] chars = new char[1_000];

        try (
            BufferedReader bufferedReader = Files.newBufferedReader(path)) {

          int numberOfChar =   bufferedReader.read(chars);
            System.out.println(Arrays.toString(chars));
            System.out.println(numberOfChar);
        }
        catch (IOException exception) {
            System.err.println(exception.getMessage());

        }
    }
}
