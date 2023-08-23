package files;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Example8 {
private static final String DATABASE_LOCATION = "/home/user/IdeaProjects/firstJavaAssessments/src/files/post.txt";

    public static void main(String[] args) {
        try ( var dataInputStream= new DataInputStream(System.in);
              FileOutputStream fileOutputStream = new FileOutputStream(DATABASE_LOCATION);
        ){
            System.out.println("Whats on your mind? ");
            byte [] post = dataInputStream.readNBytes(10);
            System.out.println(Arrays.toString(post));
            fileOutputStream.write("\n".getBytes());
            fileOutputStream.write(post);

        } catch (IOException exception) {
            System.err.println(exception.getMessage());

        }
    }
}
