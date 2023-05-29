package ATMFacilitator;

import OOP.Time;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ATM {
    private static Scanner keyboardInput = new Scanner(System.in);
    public static void main(String[] args) {
     displayMainMenu();
      }

    private static void displayMainMenu () {
        String welcomeMessage = """
                WELCOME TO FIRST BANK
                
                INSERT YOUR CARD AND PRESS ENTER
                                """;
        input(welcomeMessage);
         input("Enter your pin");
        proceedMessage();





    }

    private static void proceedMessage() {
        String message = """
                WELCOME
                
                PRESS CASH TRANSACTIONS BUTTON TO PROCEED TO TRANSACTIONS MENU
                
                ->1 CASH TRANSACTIONS
                
                ->2 SELECT INSTANT
                
                ->3 UPDATE MOBILE NUMBER
                
                PRESS CANCEL TO TERMINATE TRANSACTION
                """;

   input(message);
        cashTransactions();
    }
    private static void cashTransactions () {
        String message = """
                SELECT TRANSACTIONS
                                
                PRESS CANCEL TO TERMINATE TRANSACTIONS
                                
                1-> BALANCE                            3->   WITHDRAWAL
                2-> CHANGE PIN                          4->  TRANSFER
                5-> PAYARENA
                """;

        switch (input(message).charAt(0)) {
            case '1' -> checkBalance();
            case '2' -> changePin();
            case '3' -> withdrawal();
            case '4' -> transfer();


        }
    }
private static void amount() {
        String amountMessage = """
                        SELECT THE ACCOUNT 
                
                PRESS CANCEL TO TERMINATE TRANSACTION
               
               1-> #200                             5-> #10000
               2-> #500                             6-> #20000
               3-> #1000                            7-> OTHERS (LESS #20000)
               4-> #5000
                """;
        input(amountMessage);

        }



    private static void withdrawal () {
        accountType();
        receiptMessage();
        amount();
        display("TEMPORARILY UNABLE TO DISPENSE CASH");
        doneMessage();


    }

    private static void changePin () {
        String message = "PIN CHANGED";

        input(message);

    }
    private static void accountType () {
        String message = """
                1-> CURRENT ACCOUNT
                2-> SAVING ACCOUNT
                3 -> FIXED ACCOUNT
                """;

        input(message);

    }
    private static void doneMessage () {
        String message = """
                DO YOU WANT TO PERFORM ANOTHER TRANSACTION?
                
                1-> YES
                2 -> NO
                """;


        switch ( input(message).charAt(0))  {
            case '1'-> proceedMessage();
            default -> display("PLEASE TAKE YOUR CARD");
        }
    }
    private static void receiptMessage () {

        String message = """
                DO YOU NEED RECEIPT FOR THIS TRANSACTIONS 
                
                1 -> YES
                2 -> NO
                """;

        input(message);
    }

    private static void checkBalance () {
        accountType();
        receiptMessage();


    }
    private static void display(String message) {
        System.out.println(message);
    }
    private static String input (String prompt)  {
        display(prompt);
        return keyboardInput.nextLine();
    }

    private static void transfer () {
        String message = """
            PRESS CANCEL TO TERMINATE TRANSACTION
            
              1->  TO FIRST MONIE WALLET
              2->  TO LINKED ACCOUNT
              3->  TO FIRST BANK ACCOUNT
              4-> TO OTHER BANK ACCOUNT
                """;

        input(message);
        accountType();
        input("PLEASE ENTER THE DESTINATION ACCOUNT NUMBER");
        amount();
        doneMessage();

    }
}
