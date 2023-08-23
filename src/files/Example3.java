package files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class Example3 {


    public static void main(String[] args) {
        String location = "//home//user//Documents//javaLink//index.txt";
        Path path = Paths.get(location);

        try (
                BufferedReader bufferedReader = Files.newBufferedReader(path)) {

            Stream<String> contents = bufferedReader.lines();
            contents.forEach(System.out::println);
        }
        catch (IOException exception) {
            System.err.println(exception.getMessage());

        }
    }
}
