package accountProject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Account1 {
    private String pin;
    private String accountNumber;
    private String firstName;
    private String secondName;
    private String phoneNumber;
    private String BVN;
    private int balance;
    private List<Transaction> transactions = new ArrayList<>();

    public Account1(String firstName, String secondName, String phoneNumber, String BVN, String pin) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.phoneNumber = phoneNumber;
        validatePhoneNumber(phoneNumber);
            this.BVN = BVN;
            validateBVNForRegister(BVN);
            this.pin = pin;
            validatePinForRegister(pin);}



    private String generateTransactionID () {
        return "DCE3456BK0090" + transactions.size();
    }

    private void validatePhoneNumber (String phoneNumber)  {
        if (!phoneNumber.matches("[0-9]+")) {
            throw new IllegalArgumentException("Please enter numerical value for the phone number");
        }
        if (phoneNumber.length()!= 11) {
            throw new IllegalArgumentException("Invalid phone number length");
        }

    }

    public String getBVN(String pin) {
        try {
            validatePin(pin);
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        return BVN;
    }
    private void validateAmount (int amount) {
        if (amount <= 0) {throw new IllegalArgumentException("The amount is less than 0.");}

    }


    public void deposit(int amount) {
            validateAmount(amount);
            balance += amount;
            Transaction transaction = new Transaction(TransactionType.Deposit);
            transaction.setAmount(amount);
        transaction.setLocalDate(LocalDate.now());
        transaction.setLocalTime(LocalTime.now());
            transaction.setTransactionId(generateTransactionID());
            transactions.add(transaction);


    }


    public void transferReceived(int amount) {
        validateAmount(amount);
        balance += amount;
        Transaction transaction = new Transaction(TransactionType.Transfer_Received);
        transaction.setAmount(amount);
        transaction.setLocalDate(LocalDate.now());
        transaction.setLocalTime(LocalTime.now());
        transaction.setTransactionId(generateTransactionID());
        transactions.add(transaction);


    }



    public void withdraw(int amount, String pin) {
            validateAmount(amount);
            validatePin(pin);
            if (amount < balance) {
                balance -= amount;
                Transaction transaction = new Transaction(TransactionType.Withdraw);
                transactions.add(transaction);
                transaction.setAmount(amount);
                transaction.setLocalDate(LocalDate.now());
                transaction.setLocalTime(LocalTime.now());
                transaction.setTransactionId(generateTransactionID());

            }
            else {
                throw new IllegalArgumentException("Insufficient balance");
            }

    }


    public void transfer(int amount, String pin) {
        validateAmount(amount);
        validatePin(pin);
        if (amount < balance) {
            balance -= amount;
            Transaction transaction = new Transaction(TransactionType.Transfer);
            transactions.add(transaction);
            transaction.setAmount(amount);
            transaction.setLocalDate(LocalDate.now());
            transaction.setLocalTime(LocalTime.now());
            transaction.setTransactionId(generateTransactionID());

        }
        else {
            throw new IllegalArgumentException("Insufficient balance");
        }

    }

    public void buyAirtime(int amount, String pin) {
        validateAmount(amount);
        validatePin(pin);
        if (amount < balance) {
            balance -= amount;
            Transaction transaction = new Transaction(TransactionType.Buy_Airtime);
            transactions.add(transaction);
            transaction.setAmount(amount);
            transaction.setLocalDate(LocalDate.now());
            transaction.setLocalTime(LocalTime.now());
            transaction.setTransactionId(generateTransactionID());

        }
        else {
            throw new IllegalArgumentException("Insufficient balance");
        }

    }


    private void validateBVN (String BVN) {
        if (!this.BVN.equalsIgnoreCase(BVN)) throw new IllegalArgumentException("Invalid BVN");
        if (!BVN.matches("[0-9]+")) {
            throw new IllegalArgumentException("Please enter numerical value for the BVN");
        }
        if (BVN.length() != 10) {
            throw  new IllegalArgumentException("The length of the BVN must be 10");
        }
    }

    private void validateBVNForRegister (String BVN) {
        if (!BVN.matches("[0-9]+")) {
            throw new IllegalArgumentException("Please enter numerical value for the BVN");
        }
        if (BVN.length() != 10) {
            throw  new IllegalArgumentException("The length of the BVN must be 10");
        }
    }




    private void validatePinForRegister (String pin) {
        if (!pin.matches("[0-9]+")) {
            throw new IllegalArgumentException("Please enter  numerical value for the pin");
        }
        if (pin.length() != 4) {
            throw  new IllegalArgumentException("The length of the pin must be 4");
        }

    }

    private void validatePin(String pin) {
       validatePinForRegister(pin);
       if (!this.pin.equalsIgnoreCase(pin)) {
           throw new IllegalArgumentException("Incorrect pin");
       }

    }

    public int checkAccountBalance(String pin) {
       validatePin(pin);
        return balance;
    }


    public int checkAccountBalance() {
        return balance;
    }


    public void assignAccountNumberAssignedByBank(String accountNumber) {
     this.accountNumber =  accountNumber;
    }

    public String checkAccountNumber () {
        validateBVN(BVN);
    return accountNumber;

    }

    public void changePin(String oldPin, String newPin) {
        validatePin(oldPin);

      this.pin = newPin;
    }


    public String getFirstName() {
        return firstName;
    }



    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<Transaction> bankStatement () {
        return transactions;
    }
}
