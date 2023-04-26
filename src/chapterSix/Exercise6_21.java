package chapterSix;

import java.util.Scanner;

public class Exercise6_21 {
        public static String addFullStop(String text) {
                if (!text.endsWith("."))
                { return text + ".";}
                else{return text;}
        }


        public static String addCapitalLetter(String text) {
                if (!Character.isUpperCase(text.indexOf(0)))
                { return Character.toUpperCase(text.charAt(0)) + text.substring(1);}
                else{return text;}
        }

        public static void combinedMethod(String text) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a string");
                 text = scanner.nextLine();
               String beautify = addFullStop(text);
                System.out.println(beautify);



        }
}