package schoolExercises;

import java.util.Scanner;

public class NameExercise {
    public String getName(String name) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name");
        name = input.nextLine();
        return "Hello " + name;
    }
}
