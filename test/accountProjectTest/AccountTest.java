package accountProjectTest;

import accountProject.Account1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {

    Account1 account;

    @BeforeEach public void startWith () {
        account = new Account1 ("Timileyin", "08069547786", "6746747647", "1234");
    }
    @Test public void depositTest () {
        account.deposit(5000);
        assertEquals(5000, account.getBalance());

    }

    @Test public void depositNegativeTest () {
        assertThrows(IllegalArgumentException.class, () ->   account.deposit("hjfdhjfd"));
    }

    @Test public void withdrawTest() {
        account.deposit(5000);
        account.withdraw("1234", 3000);
        assertEquals(2000, account.getBalance());
    }

    @Test public void withdrawNegativeAmountTest() {
        account.deposit(5000);
        account.withdraw("1234", -3000);
        assertEquals(5000, account.getBalance());
    }
}
