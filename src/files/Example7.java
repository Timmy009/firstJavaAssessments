package files;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Example7 {
    public static void main(String[] args) {
      try ( var fileInputStream = new FileInputStream("//home//user//Documents//Account.json")){
         byte [] content = fileInputStream.readAllBytes();

         for (byte byt : content) {
             System.out.print(Character.toString(byt));
         }

//          System.out.println(Arrays.toString(content));
        } catch (IOException exception) {
          System.err.println(exception.getMessage());

      }
    }
}
