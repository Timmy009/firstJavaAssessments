package files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Example5 {
    public static void main(String[] args) {
        String location = "//home//user//Documents//";
        Path path = Paths.get(location);
        Path path1 = Path.of("//home//user//Documents//javaLink");

        try (
                BufferedReader bufferedReader = Files.newBufferedReader(path)) {


        }
        catch (IOException exception) {
            System.err.println(exception.getMessage());

        }
    }
}
