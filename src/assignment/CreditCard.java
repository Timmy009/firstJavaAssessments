package assignment;

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
CreditCard creditCard = new CreditCard();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, Enter card details to verify");
        String creditCardNumber = scanner.nextLine();
        System.out.println("Credit Card Type: " + creditCard.validateCardType(creditCardNumber));
        System.out.println("Credit card Number: " + creditCardNumber);
        System.out.println("Credit card digit length: " + creditCard.validateLenght(creditCardNumber));
        System.out.println("Card validity status: " + creditCard.validate(creditCardNumber));


    }

    public String validate(String creditCardNumber) {
        if (numberAtOddPositionAndSingleDigit(creditCardNumber) % 10 == 0) {
            return "Valid";
        } else {
            return "Invalid";
        }
    }

    public String validateLenght(String creditCardNumber) {
        if (creditCardNumber.length() <= 16 && creditCardNumber.length() >= 13) {
          return "The lenght is " + creditCardNumber.length();
        } else {
            return "The length is invalid";
        }
    }
        public CreditCardType validateCardType(String creditCardNumber) {
                    CreditCardType creditCardType;
           if (creditCardNumber.startsWith("4")) {
               creditCardType = CreditCardType.VISA_CARD;
           }
            else if (creditCardNumber.startsWith("5")) {
                creditCardType = CreditCardType.MASTERCARD;
            }
            else if (creditCardNumber.startsWith("37")) {
                creditCardType = CreditCardType.AMERICAN_EXPRESS_CARD;
            }
            else if (creditCardNumber.startsWith("6")) {
                creditCardType = CreditCardType.DISCOVER_CARDS;
            }
            else {
                throw  new IllegalArgumentException();
            }
            return creditCardType;
        }

        public int doublingEverySecondDigit(String creditCardNumber) {
            String digit = "";
            int numberDigit;
            int doubleNumber;
            int sum = 0;
            String doubleString;
            String valString;
            int innerInt = 0;
            for (int count = creditCardNumber.length()-2; count >= 0; count-=2){

            digit = String.valueOf(creditCardNumber.charAt(count));
            numberDigit = Integer.parseInt(digit);
            doubleNumber = numberDigit + numberDigit;

            if (doubleNumber > 9) {
                doubleString =  String.valueOf(doubleNumber);
                for (int index = doubleString.length()-1; index >= 0; index--) {
                    doubleNumber = innerInt;
                valString = String.valueOf(doubleString.charAt(index));
                innerInt = Integer.parseInt(valString);
                    doubleNumber += innerInt;
                }
            }
                sum +=doubleNumber;
         }

        return sum;
    }

    public int addDigitInOddPosition(String creditCardNumber) {
        String digit;
        int numberDigit;
        int number = 0;
        for (int count = creditCardNumber.length()-1; count >= 0; count-=2 )  {
            digit = String.valueOf(creditCardNumber.charAt(count));
            numberDigit = Integer.parseInt(digit);
            number +=numberDigit;
        }
return  number;
    }
    public int numberAtOddPositionAndSingleDigit(String creditCardNumber) {
       return   addDigitInOddPosition(creditCardNumber) + doublingEverySecondDigit(creditCardNumber);
    }
}


