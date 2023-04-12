package schoolExercises;

import java.util.Scanner;

public class BankMenuList {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);


            System.out.println("Press 1 for English");
            System.out.println("Press 2 for Yoruba");
            System.out.println("Press 3 for Igbo");
            System.out.println("Press 4 for Hausa");
            int userInput = input.nextInt();

            switch (userInput) {
                case 1:
                    System.out.println("English");
                    break;
                case 2:
                    System.out.println("Yoruba");
                    break;
                case 3:
                    System.out.println("Igbo");
                    break;
                case 4:
                    System.out.println("Hausa");
                    break;
            }
        }



}
