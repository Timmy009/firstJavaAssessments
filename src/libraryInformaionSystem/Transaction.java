package libraryInformaionSystem;

public class Transaction {
    private Book book;
    private Member member;
    private String dueDate;
    private boolean isReturned;


    public Transaction(Book book, Member member, String dueDate) {
        this.book = book;
        this.member = member;
        this.dueDate = dueDate;
        this.isReturned = isReturned;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isReturned() {
        return isReturned;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }
}
