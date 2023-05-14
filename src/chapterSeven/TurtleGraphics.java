package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class TurtleGraphics {
    public static void main(String[] args) {
        int[][] floor = new int[20][20]; // 20-by-20 array to represent the floor
        int currentRow = 0; // Current row position of the turtle
        int currentColumn = 0; // Current column position of the turtle
        boolean penDown = false; // Flag to indicate if the pen is down

        Scanner scanner = new Scanner(System.in);

        int command;
        do {
            command = scanner.nextInt();

            switch (command) {
                case 1:
                    penDown = false; // Pen up
                    break;
                case 2:
                    penDown = true; // Pen down
                    break;
                case 3:
                    turnRight(); // Turn right
                    break;
                case 4:
                    turnLeft(); // Turn left
                    break;
                case 5:
                    int spaces = scanner.nextInt();
                    moveForward(floor, currentRow, currentColumn, spaces, penDown); // Move forward
                    break;
                case 6:
                    displayFloor(floor); // Display the floor
                    break;
                case 9:
                    System.out.println("End of data"); // End of data (sentinel)
                    break;
                default:
                    System.out.println("Invalid command"); // Invalid command
                    break;
            }
        } while (command != 9);

        scanner.close();
    }

    // Method to turn the turtle right
    private static void turnRight() {
        // Adjust the turtle's direction accordingly
        // For simplicity, assume right is 0, down is 1, left is 2, up is 3
        // Turning right is equivalent to incrementing the direction value
    }

    // Method to turn the turtle left
    private static void turnLeft() {
        // Adjust the turtle's direction accordingly
        // For simplicity, assume right is 0, down is 1, left is 2, up is 3
        // Turning left is equivalent to decrementing the direction value
    }

    // Method to move the turtle forward
    private static void moveForward(int[][] floor, int currentRow, int currentColumn, int spaces, boolean penDown) {
        // Move the turtle forward in the current direction by the given number of spaces
        // If penDown is true, set the corresponding elements in the floor array to 1

        // Update the currentRow and currentColumn values accordingly
    }

    // Method to display the floor
    private static void displayFloor(int[][] floor) {
        // Iterate through the floor array and display the elements
        // Replace 1 with '*' or any other character you choose, and 0 with a blank

        for (int[] row : floor) {
            for (int element : row) {
                System.out.print((element == 1) ? "*" : " ");
            }
            System.out.println();
        }
    }
}
