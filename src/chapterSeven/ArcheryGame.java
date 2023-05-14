package chapterSeven;

import java.util.Random;

public class ArcheryGame {
    public static void main(String[] args) {



        // Number of players and chances
        int numPlayers = 4;
        int numChances = 3;

        // Create a multidimensional array to store the scores of players in each chance
        int[][] scores = new int[numPlayers][numChances];

        // Simulate the game and calculate the scores for each player
        Random random = new Random();
        for (int player = 0; player < numPlayers; player++) {
            for (int chance = 0; chance < numChances; chance++) {
                scores[player][chance] = random.nextInt(11); // Generate a random score between 0 and 10 (inclusive)
            }
        }

        // Print the table header
        System.out.println("Player\tChance 1\tChance 2\tChance 3\tTotal Score");

        // Print the scores of each player in a tabular format
        for (int player = 0; player < numPlayers; player++) {
            int totalScore = 0;
            System.out.print(player + "\t");
            for (int chance = 0; chance < numChances; chance++) {
                System.out.print(scores[player][chance] + "\t\t");
                totalScore += scores[player][chance];
            }
            System.out.println(totalScore);
        }

        // Find the player with the maximum score
        int maxScore = 0;
        int winner = -1;
        for (int player = 0; player < numPlayers; player++) {
            int totalScore = 0;
            for (int chance = 0; chance < numChances; chance++) {
                totalScore += scores[player][chance];
            }
            if (totalScore > maxScore) {
                maxScore = totalScore;
                winner = player;
            }
        }

        System.out.println("The winner is Player " + winner);
    }
}
