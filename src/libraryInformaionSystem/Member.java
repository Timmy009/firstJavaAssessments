package libraryInformaionSystem;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private String contactInformation;
    private List<Transaction> borrowingHistory= new ArrayList<>();


    public Member(String name, String contactInformation) {
        this.name = name;
        this.contactInformation = contactInformation;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public List<Transaction> getBorrowingHistory() {
        return borrowingHistory;
    }

    public void setBorrowingHistory(List<Transaction> borrowingHistory) {
        this.borrowingHistory = borrowingHistory;
    }
}
