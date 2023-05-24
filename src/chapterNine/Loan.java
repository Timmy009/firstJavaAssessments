package chapterNine;

public class Loan {

private int principalAmount;
private int tenure;


    public Loan(int principalAmount, int tenure) {
        this.principalAmount = principalAmount;
        this.tenure = tenure;
    }

    public double calculateLoan() {
        return 0.0;
    }
    public int getPrincipalAmount() {
        return principalAmount;
    }

    public void setPrincipalAmount(int principalAmount) {
        this.principalAmount = principalAmount;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }
}
