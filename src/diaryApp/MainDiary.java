package diaryApp;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class MainDiary {
    private static Diary diary = new Diary("timileyin", "timileyin59#");
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
mainMenu();

    }
    private static void mainMenu () {
        String message = """
                WELCOME TO THE DIARY
                1-> Create Gist
                2-> Delete Gist
                3.-> Update Gist
                4-> Find Gist
                """;
String option = input(message);
switch (option.charAt(0)) {
    case '1' -> createGist();
    case '2' -> deleteGist();
    case '3' -> updateGist();
    case '4' -> findGist();

}

    }


    private static void toContinue() {
        String option = input("Press 1 to continue or 2 to qu1t the APP");
        if (option.equals("1")) {
            mainMenu();
        } else {
            display("Thank You");
        }
    }
    private static void createGist () {
        String title = input("Enter title");
        String body = input("Enter the body of the diary");
        diary.addGist(title, body);

       toContinue();


    }

    private static void deleteGist () {
        String title = input("Enter the title of the gist to delete");


        diary.deleteGist(title);
        display("gist deleted successfully");
        toContinue();



    }

    private static void updateGist () {

        System.out.println("Enter gist ID to update");
        int gistId = scanner.nextInt();
        String title = input("Enter title");
        String body = input("Enter the body of the diary");
        diary.updateEntry(gistId, title, body);
        display("gist updated successfully");
toContinue();

    }

    private static void findGist () {
        String title = input("Enter the title of the gist");
        System.out.println(diary.findGistByTitle(title));


        toContinue();

    }



    private static void display (String message) {
        System.out.println(message);

    }

    private static String input (String message) {
        display(message);
        return scanner.next();

    }
}