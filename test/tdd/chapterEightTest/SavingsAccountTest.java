package tdd.chapterEightTest;

import ChapterEight.SavingsAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SavingsAccountTest{

    SavingsAccount savingsAccount;

    @BeforeEach
    public void setUp() {

    savingsAccount = new SavingsAccount(2000);
    }


@Test
    public void testSavings () {
        SavingsAccount.modifyInterestRate(0.04);
        savingsAccount.calculateMonthlyInterest();
        assertEquals(2006.6666666667, savingsAccount.getSavingsBalance());

}



}