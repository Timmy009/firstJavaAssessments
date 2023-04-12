package chapterFive;

import java.util.Scanner;

    public class Chapter5_31 {
        public static void main(String[] args) {
            System.out.println("Global Warming Facts Quiz");
            Scanner answerInput = new Scanner(System.in);

            int score = 0;
            System.out.println("Question 1: \n What is the main cause of global warming?");
            System.out.println("1. Volcanic activity");
            System.out.println("2. Sunspot activity");
            System.out.println("3. Greenhouse gases");
            System.out.println("4. Plat tectonics");
            int firstAnswer = answerInput.nextInt();
            if (firstAnswer == 3) {score++;}

            System.out.println("Question 2: \n What is the current global average temperature increase?");
            System.out.println("1. 0.1 degree celsius");
            System.out.println("2. 1 degree celsius");
            System.out.println("3. 2 degrees celsius");
            System.out.println("4. 5 Degrees Celsius");
            int secondAnswer = answerInput.nextInt();
            if (secondAnswer == 2) {score++;}

            System.out.println("Question 3: \n Which of the following is a potential effect of global warming?");
            System.out.println("1. Increased crop yields");
            System.out.println("2.  More frequent earthquakes");
            System.out.println("3. Rising sea levels");
            System.out.println("4. Decreased hurricane activity");
            int thridAnswer = answerInput.nextInt();
            if (thridAnswer == 3) {score++;}

            System.out.println("Question 4: \n What is the main source of carbon dioxide emissions?");
            System.out.println("1. Cars");
            System.out.println("2.  Power plants");
            System.out.println("3. Deforestation");
            System.out.println("4. Volcanes");
            int forthAnswer = answerInput.nextInt();
            if (forthAnswer == 2) {score++;}

            System.out.println("Question 5: \n Which country is the largest emitter of carbon dioxide?");
            System.out.println("1. China");
            System.out.println("2.  United States");
            System.out.println("3. Russia");
            System.out.println("4. India");
            int fifthAnswer = answerInput.nextInt();
            if (fifthAnswer == 1) {score++;}

            System.out.println("Your score is " + score);

            if (score == 5) {System.out.println("Excellent");}
            else if (score == 4) {
                System.out.println("Very Good");
            } else {
                System.out.println("Time to brush up on your knowledge of global warming");
                System.out.println("Visit the online library to brush up your knowledge");
            }
        }
    }
