package accountProject;

public class Account1 {

    private int balance;
    private String pin;
    private String accountNumber;
    private String accountName;
    private String phoneNumber;
    private String BVN;

    public Account1(String accountName, String phoneNumber, String BVN, String pin) {
        this.accountName = accountName;
        this.phoneNumber = phoneNumber;
        this.BVN = BVN;
        this.pin = pin;
    }

    public String getBVN() {
        return BVN;
    }

    public void setBVN(String BVN) {
        this.BVN = BVN;
    }

    public void deposit(int amount1) {
        validateAmount(amount);
        balance += amount;
    }

    public void validateAmount (int amount1) {
        if (amount <= 0) throw new IllegalArgumentException("The amount is less than 0.");
        if (!amount.getClass()!=String)

    }

    public void validateAmountType (String amount1) {
        if (amount.matches(0)) throw new IllegalArgumentException("Number required. Got letters instead");

    }
    public void validatePin (String pin) {
        if (!this.pin.equalsIgnoreCase(pin)) throw new IllegalArgumentException("Invalid Pin");

    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(String pin, int amount) {
            validatePin(pin);
            validateAmount(amount);
            if (amount > 0) {
                balance -= amount;
            }
        }

    public void checkAccountNumberAssignedByBank(String accountNumber) {
     this.accountNumber =  accountNumber;
    }
    public String checkAccountNumber () {
        return accountNumber;
    }

    public void changePin(String oldPin, String newPin) {
      validatePin(oldPin);
      this.pin = newPin;
    }


    public String getAccountName() {
        return accountName;
    }
}
