package accountProject;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private final ArrayList<Account1> accounts = new ArrayList<>();


    public String registerNewCustomer(String firstName, String secondName, String phoneNumber, String pin, String BVN) {
        for (Account1 account1 : accounts) {
            if (account1.getPhoneNumber().equals(phoneNumber)) {
                throw new IllegalArgumentException("Phone Number already exist");
            }
        }
        String accountNumber = "";
        Account1 newAccount = new Account1(firstName, secondName, phoneNumber, BVN, pin);
            accountNumber =  generateAccountNumber(newAccount);
            accounts.add(newAccount);
            newAccount.assignAccountNumberAssignedByBank(generateAccountNumber(newAccount));
            return accountNumber;
    }

    private String generateAccountNumber (Account1 account1) {
        String accountNumber = "";
        for (int count = 1; count < account1.getPhoneNumber().length(); count++) {
            accountNumber += String.valueOf(account1.getPhoneNumber().charAt(count));
        }
        return accountNumber;
    }
    private void validateAccountNumber (String accountNumber) {
        if (accountNumber.length() != 10) {
            throw new IllegalArgumentException("The length of the account number must be 10");
        }
    }


    public void deposit(String accountNumber, int amount) {
        validateAccountNumber(accountNumber);
        boolean found = false;

            for (Account1 account : accounts) {

                if (account.checkAccountNumber().equals(accountNumber)) {
                    account.deposit(amount);
                    found = true;

                }



            }
            if (!found) {
                throw new IllegalArgumentException("Account number does not exist");
            }

        }



    public void withdraw(String accountNumber, int amount, String pin) {
        validateAccountNumber(accountNumber);
        boolean found = false;
        for (Account1 account : accounts) {
            if (account.checkAccountNumber().equals(accountNumber)) {
                account.withdraw(amount, pin);
                found = true;
            }

        }
        if (!found) {
            throw new IllegalArgumentException("Account number does not exist");
        }

    }

    public void transfer(String senderAccountNumber, String receiverAccountNumber, int amount, String pin) {
        validateAccountNumber(senderAccountNumber);
        validateAccountNumber(receiverAccountNumber);
        boolean found1 = false;
        boolean found2 = false;
        for (Account1 account : accounts) {
            if (account.checkAccountNumber().equals(receiverAccountNumber)) {
                account.deposit(amount);
                found1 = true;
            }
            if (account.checkAccountNumber().equals(senderAccountNumber)) {
                account.transfer(amount, pin);
                found2 = true;
            }
        }
        if (!found1) {
            throw new IllegalArgumentException("Receiver Account number does not exist");
        }
        if (!found2) {
            throw new IllegalArgumentException("Sender Account number does not exist");
        }
    }

    public int accountSize() {
        return accounts.size();
    }


    public int getBalanceOfAccount(String accountNumber, String pin) {
        validateAccountNumber(accountNumber);
        for (Account1 account1 : accounts) {
            if (account1.checkAccountNumber().equals(accountNumber)) {
                return account1.checkAccountBalance(pin);

            }

        }
     throw new IllegalArgumentException("Invalid Account number");
    }


    public int getBalanceOfAccount(String accountNumber) {
        validateAccountNumber(accountNumber);
        for (Account1 account1 : accounts) {
            if (account1.checkAccountNumber().equals(accountNumber)) {
                return account1.checkAccountBalance();
            }

        }
        throw new IllegalArgumentException("Invalid Account number");
    }

    public String getAccountName(String accountNumber) {
        validateAccountNumber(accountNumber);
        for (Account1 account1 : accounts) {
            if (account1.checkAccountNumber().equals(accountNumber)) {
                return account1.getFirstName();
            }
        }
       throw new IllegalArgumentException("This account does not exist");

    }

    public List<Transaction> bankStatement (String accountNumver) {
        validateAccountNumber(accountNumver);
        for (Account1 account1 : accounts) {
            if (account1.checkAccountNumber().equals(accountNumver)) {
              return   account1.bankStatement();
            }
        }
        throw new IllegalArgumentException("Invalid Account number");
    }
public void buyAirtime (int amount, String accountNumber, String pin, String phoneNumber) {
    validateAccountNumber(accountNumber);
    boolean found = false;
    for (Account1 account : accounts) {
        if (account.checkAccountNumber().equals(accountNumber)) {
            account.buyAirtime(amount, pin);
            found = true;
        }
    }
    if (!found) {
        throw new IllegalArgumentException("Account number does not exist");
    }
}


    public void buyAirtime (int amount, String accountNumber, String pin) {
        validateAccountNumber(accountNumber);
        boolean found = false;
        for (Account1 account : accounts) {
            if (account.checkAccountNumber().equals(accountNumber)) {
                account.buyAirtime(amount, pin);
                found = true;
            }
        }
        if (!found) {
            throw new IllegalArgumentException("Account number does not exist");
        }
    }

}