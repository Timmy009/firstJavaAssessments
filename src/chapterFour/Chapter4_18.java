package chapterFour;

import java.util.Scanner;

public class Chapter4_18 {
    public static void main(String[] args) {


        Scanner customerInput = new Scanner(System.in);

        System.out.println("Enter the number of customer");
        int totalNumOfCustomer = customerInput.nextInt();

        int accountNumber;
        int beginningBalance;
        int totalOfAllItems;
        int totalCredit;
        int allowedCredit;
        int newBalance;
        int numberOfCustomer = 1;
        while (numberOfCustomer <= totalNumOfCustomer) {
            System.out.println("Customer " + numberOfCustomer);
            System.out.print("Enter account number: ");
            accountNumber = customerInput.nextInt();
            System.out.print("Enter the balance as at the beginning of the month: ");
            beginningBalance = customerInput.nextInt();
            System.out.print("Enter the total items charged by the customer this month: ");
            totalOfAllItems = customerInput.nextInt();
            System.out.print("Enter the total of all credits applied to the customer`s account this month: ");
            allowedCredit = customerInput.nextInt();
            System.out.print("Enter the allowed credit limit: ");
            allowedCredit = customerInput.nextInt();

            newBalance = beginningBalance + totalOfAllItems - allowedCredit;
            System.out.println("The new balance of customer " + numberOfCustomer + " is " + newBalance);
            if (newBalance > allowedCredit) {
                System.out.println("Credit limit Exceedded");

                numberOfCustomer++;
            }
        }
    }
}