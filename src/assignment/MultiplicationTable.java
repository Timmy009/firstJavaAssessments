package assignment;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positve number: ");
        int number = input.nextInt();

            int count = 1;
            while (count <= 12) {
                if (number > 0) {
                System.out.println(number + " * " + count + " = " + number * count);

                    count++; }

                else {System.out.println("Invalid Number. Enter a positve Integer");
                number = input.nextInt();}

            }
        }

    }

