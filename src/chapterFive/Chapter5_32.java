package chapterFive;

import java.util.Scanner;

    public class Chapter5_32 {
        public static void main(String[] args) {
            Scanner expenseInput = new Scanner(System.in);


            System.out.print("Enter the house expenses: ");
            int houseExpense = expenseInput.nextInt();

            System.out.print("Enter the food expenses: ");
            int foodExpense = expenseInput.nextInt();

            System.out.print("Enter the cloth expenses: ");
            int clothExpense = expenseInput.nextInt();

            System.out.print("Enter the transportation expenses: ");
            int transportationExpense = expenseInput.nextInt();

            System.out.print("Enter the Education expenses: ");
            int educationExpense = expenseInput.nextInt();

            System.out.print("Enter the health care expenses: ");
            int healthCareExpense = expenseInput.nextInt();

            System.out.print("Enter the vacations expenses: ");
            int vacationExpense = expenseInput.nextInt();

            int totalExpense = houseExpense + foodExpense + clothExpense + transportationExpense + educationExpense + healthCareExpense + healthCareExpense + vacationExpense;

            double taxRate = 0.23;

            double fairTax = totalExpense * taxRate;

            System.out.printf("The fair tax is %.2f",  fairTax);

        }
    }

