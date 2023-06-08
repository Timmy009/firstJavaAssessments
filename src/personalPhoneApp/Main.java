package personalPhoneApp;

import java.util.List;
import java.util.Scanner;

public class Main {
private static PhoneBook phoneBook =  new PhoneBook();
private static Scanner keyboardInput = new Scanner(System.in);
    public static void main(String[] args) {

        mainMenu();

    }

    private static void mainMenu () {
        String message = """
                1. Create Contact
                2. Search Contact by name     
                """;
        String option = input(message);
        switch (option.charAt(0)) {
            case '1':
                createContact();
                break;
            case '2':
                findContact();
                break;
        }
    }
       private static void createContact () {
          String firstName = input("Enter first name");
           String lastName = input("Enter last name");
          String phoneNumber = input("Enter the phone number");
          phoneBook.createContact(firstName, lastName, phoneNumber);
          display("SAVED...");
          mainMenu();
        }

private static void contactOperation (String firstName) {
        String messge = """
                Perform Operation
                1. Delete Contact
                2. Block Contact
                3. Update Contact Information
                """;
        String option = input(messge);
        switch (option.charAt(0)) {
            case '1':
                phoneBook.deleteContact(firstName);
                break;
            case '2':
                phoneBook.blockContact(firstName);
                break;
            case '3':
                String newFirstName = input("Enter the new First name");
                String newLastName = input("Enter the new last name");
                String email = input("Enter the email address");
                String address = input("Enter the address");
                String birthday = input("Enter the email address");
                String socialProfile= input("Enter the social profile");
                phoneBook.updateContactInformation(firstName, newFirstName, newLastName, email, address, birthday, socialProfile);
                break;



        }

}

        private static void findContact () {
            display("CONTACTS");
                display(phoneBook.displayAllContact().toString());


            String name = input("Search Contact by name");
            System.out.println(phoneBook.findContactByName(name));
            if (phoneBook.findContactByName(name).size() > 1) {
                display("Enter the " + name + " you want by inputting the index");
                int index = keyboardInput.nextInt();
               display(phoneBook.findContactByIndex(name, index).getFirstName() + " " + phoneBook.findContactByIndex(name, index).getLastName() + " " + phoneBook.findContactByIndex(name, index).getPhoneNumber());
            }
            else {
                display(phoneBook.findContactByIndex(name, 0).getFirstName() + " " + phoneBook.findContactByIndex(name, 0).getLastName() + " " + phoneBook.findContactByIndex(name, 0).getPhoneNumber());
            }
            contactOperation(name);
            mainMenu();
        }



    private static void display (String message) {
        System.out.println(message);
    }

    private static String input (String inputMessage) {
        display(inputMessage);
        return keyboardInput.next();
    }


}
