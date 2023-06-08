//package accountProjectTest;
//
//import accountProject.Bank;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class BankTest {
//
//    Bank bank;
//
//    @BeforeEach
//    public void startWith() {
//        bank = new Bank();
//    }
//
//    @Test
//    public void registerTest() {
//        bank.registerNewCustomer("Timileyin", "09024943627", "1234", "7843784378");
//        assertEquals(1, bank.accountSize());
//    }
//
//    @Test
//    public void depositTest() {
//        String accountNumber =   bank.registerNewCustomer("Timileyin", "09024943627", "1234", "7843784378");
//        bank.deposit(accountNumber, 5000);
//        assertEquals(5000, bank.getBalanceOfAccount(accountNumber, "1234"));
//    }
//
//    @Test
//    public void withdrawTest() {
//        String accountNumber =   bank.registerNewCustomer("Timileyin", "09024943627", "1234", "7843784378");
//        bank.deposit(accountNumber, 5000);
//        assertEquals(5000, bank.getBalanceOfAccount(accountNumber, "1234"));
//        bank.withdraw(accountNumber, 3000, "1234");
//        assertEquals(2000, bank.getBalanceOfAccount(accountNumber, "1234"));
//    }
//
//    @Test
//    public void transferTest() {
//        String senderAccountNumber =   bank.registerNewCustomer("Timileyin", "09024943627", "1234", "7843784378");
//        String receiverAccountNumber = bank.registerNewCustomer("Mike", "08069547786", "3456", "7843784387");
//        bank.deposit(senderAccountNumber, 5000);
//        bank.transfer(senderAccountNumber, receiverAccountNumber,3000, "1234");
//        assertEquals(2, bank.accountSize());
//        assertEquals(2000, bank.getBalanceOfAccount(senderAccountNumber, "1234"));
//        assertEquals(3000, bank.getBalanceOfAccount(receiverAccountNumber, "3456"));
//    }
//
////    @Test public void transferNegativeAmountTest() {
////        bank.registerNewCustomer("Timileyin", "09024943627", "1234", "784378437878");
////        String senderAccountNumber = bank.getAccountAccountNumberByName("Timileyin", "784378437878");
////        bank.registerNewCustomer("Mike", "08069547786", "2345", "6743787854854");
////        String receiverAccountNumber = bank.getAccountAccountNumberByName("Mike", "6743787854854");
////        bank.deposit(senderAccountNumber, 5000);
////        bank.transfer(senderAccountNumber, receiverAccountNumber, -3000, "1234");
////        assertEquals(2, bank.accountSize());
////        assertEquals(5000, bank.getBalanceOfAccount(senderAccountNumber));
////        assertEquals(0, bank.getBalanceOfAccount(receiverAccountNumber));
////    }
//}