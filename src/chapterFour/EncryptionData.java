package chapterFour;

import java.util.Scanner;

public class EncryptionData {

    public String encryptData(String data) {
        int count = 1;
        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        int fourthNumber = 0;
        while (count <= data.length()) {
        char dataDigit = data.charAt(count - 1);
        int dataNumber = Character.getNumericValue(dataDigit);
        int enccrypt = (dataNumber + 7) % 10;
        if (count == 1) {firstNumber = enccrypt;}
        if (count == 2) {secondNumber = enccrypt;}
        if (count == 3) {thirdNumber = enccrypt;}
        if (count == 4) {fourthNumber = enccrypt;}
            count++;
        }
        return thirdNumber + "" + fourthNumber + "" + firstNumber + "" + secondNumber;
    }
    public String decryptData (String data) {
        int count = 1;
        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        int fourthNumber = 0;
        while (count <= data.length()) {
            char dataDigit = data.charAt(count - 1);
            int dataNumber = Character.getNumericValue(dataDigit);
            int enccrypt = ((dataNumber + 10) - 7) % 10;
            if (count == 1) {firstNumber = enccrypt;}
            if (count == 2) {secondNumber = enccrypt;}
            if (count == 3) {thirdNumber = enccrypt;}
            if (count == 4) {fourthNumber = enccrypt;}
            count++;
        }
        return thirdNumber + "" + fourthNumber + "" + firstNumber + "" + secondNumber;
    }


    public void dataValidation () {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose between the following options");
        System.out.println("1. Encryption");
        System.out.println("2. Decryption");
        System.out.println("3. Exit");
        String optionsSelection = input.nextLine();
        switch (optionsSelection) {
            case "1":
                System.out.println("Enter a number");
                String data = input.nextLine();
                while (data.length() != 4 || !data.matches("^[0-9]+$")) {
                    System.out.println("Enter a valid four digit number");
                    data = input.nextLine();
                }
                System.out.println("The encryted data is " + encryptData(data));
                System.out.println();
                System.out.println("If you wish to check another number or Exit the APP");
                dataValidation();
                break;
            case "2":
                System.out.println("Enter a number");
                data = input.nextLine();
                while (data.length() != 4 || !data.matches("^[0-9]+$")) {
                    System.out.println("Enter a valid four digit number");
                    data = input.nextLine();
                }
                System.out.println("The decryted data is " + decryptData(data));
                System.out.println();
                System.out.println("If you wish to check another number or Exit the APP");
                dataValidation();
                break;
            case "3":
                System.exit(1);
                break;
            default:
                System.out.println("Enter a number between 1 and 3 only.");
                System.out.println();
                dataValidation();
        }
    }


}

