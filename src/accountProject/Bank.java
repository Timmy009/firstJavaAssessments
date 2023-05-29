package accountProject;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Account1> accounts = new ArrayList<>();
    private String bankNumber = "234765895";


    public void registerNewCustomer (String name, String phoneNumber, String pin, String BVN) {
        if (name != "" && phoneNumber != "") {
            Account1 newAccount = new Account1(name, phoneNumber, BVN, pin);
            accounts.add(newAccount);
            newAccount.checkAccountNumberAssignedByBank(generateAccountNumber());

        }

    }
    public void deposit (String accountNumber, int amount) {
        for (Account1 account : accounts) {
            if (account.checkAccountNumber() == accountNumber) {
                account.deposit(amount);
            }
        }
    }
    public void withdraw (String accountNUmber, int amount, String pin) {
        for (Account1 account : accounts) {
            if (account.checkAccountNumber() == accountNUmber) {
                account.withdraw(pin, amount);
            }
        }
    }

public void transfer(String senderAccountNumber, String receiverAccountNumber, int amount, String pin) {
    for (Account1 account : accounts) {
        if (account.checkAccountNumber() == senderAccountNumber) {
            account.withdraw(pin, amount);}
            if (account.checkAccountNumber() == receiverAccountNumber) {
                account.deposit(amount);

        }
    }
}
public int accountSize () {
        return accounts.size();
}
public String getAccountAccountNumberByName (String name, String BVN) {
        for (Account1 account : accounts) {
            if (account.getAccountName() == name && account.getBVN()==BVN)
                return account.checkAccountNumber();
        }
        return null;
}
public int getBalanceOfAccount (String accountNumber) {
        for (Account1 account1 : accounts) {
            if (account1.checkAccountNumber() == accountNumber)
            {
                return account1.getBalance();
            }
        }
        return 0;
}

private String generateAccountNumber () {
    return bankNumber + accountSize();
}
}
