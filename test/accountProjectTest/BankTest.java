package accountProjectTest;

import accountProject.Bank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {

    Bank bank;

    @BeforeEach
    public void startWith() {
        bank = new Bank();
    }

    @Test
    public void registerTest() {
        bank.registerNewCustomer("Timileyin", "Bamgbose", "1234", "784378437878");
        assertEquals(1, bank.accountSize());
    }

    @Test
    public void depositTest() {
        bank.registerNewCustomer("Timileyin", "09024943627", "1234", "784378437878");
        String accountNumber = bank.getAccountAccountNumberByName("Timileyin", "784378437878");
        bank.deposit(accountNumber, 5000);
        assertEquals(5000, bank.getBalanceOfAccount(accountNumber));

    }

    @Test
    public void withdrawTest() {
        bank.registerNewCustomer("Timileyin", "09024943627", "1234", "784378437878");
        String accountNumber = bank.getAccountAccountNumberByName("Timileyin", "784378437878");
        bank.deposit(accountNumber, 5000);
        assertEquals(5000, bank.getBalanceOfAccount(accountNumber));
        bank.withdraw(accountNumber, 3000, "1234");
        assertEquals(2000, bank.getBalanceOfAccount(accountNumber));
    }

    @Test
    public void transferTest() {
        bank.registerNewCustomer("Timileyin", "09024943627", "1234", "784378437878");
        String senderAccountNumber = bank.getAccountAccountNumberByName("Timileyin", "784378437878");
        bank.registerNewCustomer("Mike", "08069547786", "3456", "78437843874");
        String receiverAccountNumber = bank.getAccountAccountNumberByName("Mike", "78437843874");
        bank.deposit(senderAccountNumber, 5000);
        bank.transfer(senderAccountNumber, receiverAccountNumber, 3000, "1234");
        assertEquals(2, bank.accountSize());
        System.out.println(senderAccountNumber);
        System.out.println(receiverAccountNumber);
        assertEquals(2000, bank.getBalanceOfAccount(senderAccountNumber));
        assertEquals(3000, bank.getBalanceOfAccount(receiverAccountNumber));
    }

    @Test public void transferNegativeAmountTest() {
        bank.registerNewCustomer("Timileyin", "09024943627", "1234", "784378437878");
        String senderAccountNumber = bank.getAccountAccountNumberByName("Timileyin", "784378437878");
        bank.registerNewCustomer("Mike", "08069547786", "2345", "6743787854854");
        String receiverAccountNumber = bank.getAccountAccountNumberByName("Mike", "6743787854854");
        bank.deposit(senderAccountNumber, 5000);
        bank.transfer(senderAccountNumber, receiverAccountNumber, -3000, "1234");
        assertEquals(2, bank.accountSize());
        assertEquals(5000, bank.getBalanceOfAccount(senderAccountNumber));
        assertEquals(0, bank.getBalanceOfAccount(receiverAccountNumber));
    }
}