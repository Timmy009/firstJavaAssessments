package schoolExercises;

import java.util.Scanner;

public class FactorialExercise {
    public int calculateFactorial (int number) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        number = input.nextInt();
        int factorial = 1;
        int count = number;
        while (count >= 1) {
            factorial =factorial * count;
            count--;

        }
        return factorial;
    }
}
