package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class CII {


    private SecureRandom randomNUmber = new SecureRandom();
    public String multiplication(int firstNumber, int secondNumber) {
        return "How much is " + firstNumber + " times " + secondNumber;
    }



    public void playGame () {
        int count = 1;
        int correctResponses = 0;
        int incorrectResponses = 0;
        int firstNumber = 1 + randomNUmber.nextInt(10);
        int secondNumber = 1 + randomNUmber.nextInt(10);
        System.out.println(multiplication(firstNumber, secondNumber));
        Scanner userInput = new Scanner(System.in);
        int response = userInput.nextInt();

        while (response != (firstNumber * secondNumber)) {
            if (count == 10) {
                break;
            }
            commentsOnIncorrectAnswer();
            System.out.println(multiplication(firstNumber, secondNumber));
            response = userInput.nextInt();
            incorrectResponses++;
            count++;

        }
        while (true) {if (count == 10) {
            continue;
        }

            count++;
            correctResponses++;
            commentsOnCorrectAnswer();
            playGame();

        }

//            correctResponses = 0;
//            float percentageCorrect = (float) correctResponses / 10 * 100;
//            System.out.println("The percentage score is " + percentageCorrect);
//            if (percentageCorrect > 75) {
//                System.out.println("Congratulations, you are ready to go to the next level");
//            } else {
//                System.out.println("Please ask your teacher for help. Let another student try.");
//            }
    }

    public void commentsOnCorrectAnswer () {
        int commentOptions = 1 + randomNUmber.nextInt(4);
        switch (commentOptions) {
            case 1:
                System.out.println("Very good!");
                break;
            case 2:
                System.out.println("Excellent!");
                break;
            case 3:
                System.out.println("Nice work!");
                break;
            default:
                System.out.println("Keep up the good work!");
                break;
        }}
        public void commentsOnIncorrectAnswer () {
            int commentOptions = 1 + randomNUmber.nextInt(4);
            switch (commentOptions) {
                case 1:
                    System.out.println("No. PLease try again!");
                    break;
                case 2:
                    System.out.println("Wrong. TRy once more!");
                    break;
                case 3:
                    System.out.println("Dont give up!");
                    break;
                default:
                    System.out.println("No. Keep trying!");
                    break;
            }
    }
}
