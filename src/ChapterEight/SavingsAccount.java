package ChapterEight;

public class SavingsAccount {

        private static double accountInterestRate;

        private double savingsBalance;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static double getAccountInterestRate() {
            return accountInterestRate;
        }

        public static void modifyInterestRate(double accountInterestRate) {
            SavingsAccount.accountInterestRate = accountInterestRate;
        }

        public double getSavingsBalance() {
            double balance =  savingsBalance + calculateMonthlyInterest();
            return balance;
        }



        public double calculateMonthlyInterest() {
            return (accountInterestRate * savingsBalance ) / 12;
        }
    }


