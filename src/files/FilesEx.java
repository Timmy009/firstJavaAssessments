package files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilesEx {

    public static void main(String[] args) {



    String location = "/home/user/Documents/javaLink//items.json";
    Path path = Paths.get(location);
        try (
                BufferedReader bufferedReader = Files.newBufferedReader(path)) {

            Stream<String> contents = bufferedReader.lines();
            contents.forEach(System.out::println);
        }
        catch (IOException exception) {
            System.err.println(exception.getMessage());

        }



        try ( var fileInputStream = new FileInputStream("/home/user/Documents/javaLink//items.json")){
            byte [] content = fileInputStream.readAllBytes();

            for (byte byt : content) {


             if (Character.toString(byt).equals("5")) {
                 System.out.print("3");
              }
             else {
                 System.out.print(Character.toString(byt));
             }
            }

//          System.out.println(Arrays.toString(content));
        } catch (IOException exception) {
            System.err.println(exception.getMessage());

        }



    }

}
