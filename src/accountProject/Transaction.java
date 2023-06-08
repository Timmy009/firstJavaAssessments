package accountProject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Transaction {
    private LocalDate localDate;
    private LocalTime localTime;
    private TransactionType transactionDescription;
    private String transactionId;
    private int amount;


    public Transaction(TransactionType transactionType) {
        this.transactionDescription = transactionType;
    }


    public int getAmount() {
        return amount;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    @Override
    public String toString() {
        return "\nTransaction Date :::: " + localDate + " " + localTime +
                "   ||    transactionDescription :::: " + transactionDescription +
                "\ntransactionId :::: " + transactionId +
                "   ||  amount :::: " + amount +
                '\n';
    }
}
