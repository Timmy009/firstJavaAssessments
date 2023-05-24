package chapterNine;

public class PersonalLoan extends Loan{
    private final double interestRate;

    public PersonalLoan(int principalAmount, int tenure, double interestRate) {
        super(principalAmount, tenure);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {


        return 0.0;



    }
}
