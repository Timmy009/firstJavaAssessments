
import jdk.jfr.Name;
import org.junit.jupiter.api.Test;
import tddProject.Account;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AccountTest {
        private Account timmyAccount = new Account ();


        @Test
        public void depositMoneyTest () {

            //given
//        Account timmyAccount = new Account();

            //when

            timmyAccount.deposit(2_000);

            //assert
            int balance = timmyAccount.getBalance();
            assertEquals(2_000, balance);
        }
        @Test
        public void depositTwiceMoneyTest () {

            //given
//        Account timmyAccount = new Account();

            //when

            timmyAccount.deposit(2_000);
            timmyAccount.deposit(2_000);

            //assert
            int balance = timmyAccount.getBalance();
            assertEquals(4_000, balance);
        }
        @Test
        public void depositNegativeValueTest () {
            timmyAccount.deposit(-2_000);
            assertEquals(0, timmyAccount.getBalance());

        }
        @Test
        @Name("depositMoney")
        public void depositTwiceNegativeValueTest () {
            timmyAccount.deposit(-9_000);
            timmyAccount.deposit(-3_000);
            assertEquals(0, timmyAccount.getBalance());

        }

        @Test
        public void withdrawTest () {
            timmyAccount.setBalance(5000);

            timmyAccount.withdraw(3000);

            assertEquals(2000, timmyAccount.getBalance());
        }
        @Test
        public void withdraw6kTest () {
            timmyAccount.setBalance(5000);

            timmyAccount.withdraw(6000);

            assertEquals(5000, timmyAccount.getBalance());

        }

        @Test
        public void withdrawNegativeTest () {
            timmyAccount.setBalance(5000);

            timmyAccount.withdraw(-3000);

            assertEquals(5000, timmyAccount.getBalance());
        }

    }

