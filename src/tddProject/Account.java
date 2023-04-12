package tddProject;

    public class Account {
        private int balance;

        public void deposit(int amount) {
            if (amount < 1 ) {
                amount = 0;
            }
            balance =  balance + amount;

        }

        public void setBalance (int balance) {
            this.balance = balance;
        }
        public int getBalance() {

            return balance;
        }
        public void withdraw (int withdrawAmount) {
            if (withdrawAmount > 0 && withdrawAmount <= balance)  balance -= withdrawAmount;
        }
    }

