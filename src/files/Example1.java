package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example1 {
    public static void main(String[] args) {

        String content = """
                public class Account
                
                """;


//        String location = "/home/user/Downloads";
//        Path path = Paths.get(location);
//
//        System.out.println(path.getFileSystem());
//        System.out.println(path.toFile());

        String location = "//home//user//Desktop//timtim";

        Path path = Path.of(location);

        try {
      Files.createTempFile(path, "note.txt", null);}
        catch (IOException exception) {
            System.err.println(exception.getMessage());
        }

    }
}
