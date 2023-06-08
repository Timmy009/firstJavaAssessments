package accountProject;

import java.sql.Time;
import java.time.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner keyboardInput = new Scanner(System.in);
    private static Bank myBank = new Bank();


    public static void main(String[] args) throws InterruptedException {
        proceedMessage();
    }


    private static void threadNow () throws InterruptedException {
        System.out.print("Loading, please wait");
        for (int index = 0; index < 3; index++) {
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
        }
        System.out.println();
    }

    private static void checkBalance () {

        String accountNumber = input("Enter your account number");
        String pin = input("Enter your pin");
        try {
            System.out.println("Your balance is " + myBank.getBalanceOfAccount(accountNumber, pin));
            proceedMessage();
        }
        catch (IllegalArgumentException | InterruptedException ex) {
            display(ex.getMessage());
        }
    }
    private static void proceedMessage() throws InterruptedException {
        threadNow();
        String message = """
                WELCOME TO FIRST BANK
               
                ->1 Register

                ->2 Deposit

                ->3 Withdraw

                ->4 Transfer
                
                ->5 Check Balance
                
                ->6 Get mini Transaction history
                
                ->7 Buy Airtime
                
                ->8 Live Chat
                PRESS ANY OTHER KEY TO TERMINATE TRANSACTION
                """;

        System.out.println(message);

        String option = keyboardInput.next();
        switch (option) {
            case "1":
                register();
                break;
            case "2":
                deposit();
                break;
            case "3":
                withdraw();
                break;
            case "4":
                transfer();
            case "5":
                checkBalance();
                break;
            case "6":
                getBankStatement();
                break;
            case "7":
                buyAirtime();
                break;
            case "8":
                liveChat();
                break;
            default:
                display("Thank You");
        }

    }

    private static void continueFinally () throws InterruptedException {
        String messageRedo = input("Do you want to perform another transaction. Press 1 to continue or any other key to cancel");
        if (messageRedo.equalsIgnoreCase("1")) {
            proceedMessage();
        } else {
            display("Thank You for banking with us");
        }
    }

    private static void register() throws InterruptedException {
        String message = """
                WELCOME TO THE BANK REGISTRATION PORTAL

                Kindly enter the following information correctly
                """;
        display(message);
        String firstName = input("Enter your first name");
        String secondName = input("Enter your surname");
        String phoneNumber = input("Enter your phoneNumber");
        String pin = input("Enter a valid pin");
        String BVN = input("Enter your BVN");

        try {
           String accounNumber = myBank.registerNewCustomer(firstName, secondName, phoneNumber, pin, BVN);
            display("**** ACCOUNT CREATION ALERT**** \n" +  "Dear " + firstName + " "+ secondName + ", Your account has been created successfully.\nYour account number is " + accounNumber + "\nThank you for choosing First Bank");
        } catch (Exception ex) {
            display(ex.getMessage());
        }
        finally {
            continueFinally();
        }



    }

private static void getBankStatement () throws InterruptedException {

    String message = """
              BANK STATEMENT
                """;
    display(message);
    String accountNumber = input("Enter your account number");
    try {
if(myBank.bankStatement(accountNumber).size()< 1) {
    display("NO TRANSACTION HAS OCCURED ON THIS ACCOUNT");}
    else {

        display(myBank.bankStatement(accountNumber).toString());}

    }
    catch (Exception ex) {
        System.out.println(ex.getMessage());
    }


    finally {
        continueFinally();
    }
}
    private static void deposit() throws InterruptedException {
        String message = """
                WELCOME TO THE DEPOSIT PORTAL.

                Enter the following information to deposit
                """;
        display(message);
        String accountNumber = input("Enter your account number");
        System.out.println("Enter amount");
        int amount = 0;
        try {
            amount = Integer.parseInt(keyboardInput.next());
            myBank.deposit(accountNumber, amount);
            display("CREDIT ALERT" + "\nAccount Number: " + accountNumber + "\nCR: NGN" + amount + "\nDesc: Deposit" + "\nDate : " + LocalDate.now() + " " + LocalTime.now() + "\nAvailable Balance : NGN" + myBank.getBalanceOfAccount(accountNumber));

                } catch (Exception ex) {
            display("Invalid input");

        }

finally {
            continueFinally();
        }


    }

    private static void withdraw() throws InterruptedException {

        String message = """
                WELCOME TO THE WITHDRAW PORTAL.

                Enter the following information to deposit
                """;
        display(message);
        String accountNumber = input("Enter your account number");
        String pin = input("Enter your pin");
        System.out.println("Enter amount");
        int amount = 0;
        try {
            amount = keyboardInput.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Enter number for the amount");
        }

        try {

            myBank.withdraw(accountNumber, amount, pin);
            display("DEBIT ALERT" + "\nAccount Number: " + accountNumber + "\nDR: NGN" + amount + "\nDesc: Deposit" + "\nDate : " + LocalDate.now() + " " + LocalTime.now() + "\nAvailable Balance : NGN" + myBank.getBalanceOfAccount(accountNumber));
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


        finally {
            continueFinally();
        }

    }



    private static void transfer() throws InterruptedException {

        String message = """
                WELCOME TO THE WITHDRAW PORTAL.

                Enter the following information to deposit
                """;
        display(message);
        String senderNumber = input("Enter your account number");
        String receiverNumber = input("Enter the receiver account number");
        String senderPin = input("Enter your pin");
        System.out.println("Enter amount");
        int amount = 0;
        try {
            amount = keyboardInput.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Enter number for the amount");
        }

        try {

            myBank.transfer(senderNumber, receiverNumber, amount, senderPin);
            display("DEBIT ALERT" + "\nAccount Number: " + senderNumber + "\nDR: NGN" + amount + "\nDesc: Transfer to " + myBank.getAccountName(receiverNumber) + "\nDate : " + LocalDate.now() + " " + LocalTime.now() + "\nAvailable Balance : NGN" + myBank.getBalanceOfAccount(senderNumber));
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


        finally {
            continueFinally();
        }

    }

    private static void buyAirtime() throws InterruptedException {
        String message = """
                WELCOME TO THE AIRTIME PORTAL.

                Enter the following information to deposit
                """;
        display(message);
        String accountNumber = input("Enter your account number");
        String pin = input("Enter your pin");

        System.out.println("Enter amount");
        int amount = 0;
        try {
            amount = keyboardInput.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Enter number for the amount");
        }
        String option = input("""
                -> 1    Self
                -> 2    Third-Party
                -> Press any other key to go Back to the main menu
                """);
        try {
switch (option) {
    case "1":
        myBank.buyAirtime(amount, accountNumber, pin);
        display("DEBIT ALERT" + "\nAccount Number: " + accountNumber + "\nDR: NGN" + amount + "\nDesc: Airtime Purchase" + "\nDate : " + LocalDate.now() + " " + LocalTime.now() + "\nAvailable Balance : NGN" + myBank.getBalanceOfAccount(accountNumber));
    break;
        case "2":
       String phoneNumber = input("Enter the third party phone Number");
        myBank.buyAirtime(amount, accountNumber, pin, phoneNumber);
            display("DEBIT ALERT" + "\nAccount Number: " + accountNumber + "\nDR: NGN" + amount + "\nDesc: Airtime Purchase to " + phoneNumber  + "\nDate : " + LocalDate.now() + " " + LocalTime.now() + "\nAvailable Balance : NGN" + myBank.getBalanceOfAccount(accountNumber));
    break;
            default:
        proceedMessage();
}


        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            continueFinally();
        }
    }

private static void liveChat () throws InterruptedException {
        String message = """
                WE ARE UNAVAILABLE AT THIS MOMENT. TALK TO A REPRESENTATIVE OF OUR CUSTOMER SUPPORT.
                +234-8069547786
                """;
        display(message);
        continueFinally();
}

        private static void display(String message) {
        System.out.println(message);
    }

    private static String input (String prompt)  {
        display(prompt);
        return keyboardInput.next();
    }

}
