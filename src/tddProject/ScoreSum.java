package tddProject;

import java.util.Scanner;

    public class ScoreSum {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int scoresSum = 0;
            int count = 1;
            while (count <= 5) {
                System.out.println("Enter Score");
                scoresSum = scoresSum + input.nextInt();
                count++;
            }
            System.out.println("The sum of all the scores are " + scoresSum);
        }
    }

