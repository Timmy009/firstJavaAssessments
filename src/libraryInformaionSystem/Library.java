package libraryInformaionSystem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private boolean isBookShelveEmpty;
    private boolean isAvailable;
    private List<Book> bookShelves = new ArrayList<>();
    private List<Member> members = new ArrayList<>();
    private List<Transaction> transactions = new ArrayList<>();
    private boolean isMemberEmpty;
    private boolean isMemberAvailable;

    public boolean isBookShelveEmpty() {
        isBookShelveEmpty = bookShelves.isEmpty();
        return isBookShelveEmpty;

    }

    public boolean isMemberListEmpty() {
        isMemberEmpty = members.isEmpty();
        return isMemberEmpty;

    }


    public void addBook(Book book) {
        bookShelves.add(book);
    }


    public void addMember(Member member) {
        members.add(member);
    }
    public boolean isAvailable(String bookTitle) {
        boolean bookIsAvailable;
        for (Book book: bookShelves) {
          bookIsAvailable =  book.getTitle().equalsIgnoreCase(bookTitle);
          if (bookIsAvailable) { isAvailable = true; break;}
            else { isAvailable = false;}
        }
      return isAvailable;
    }

    public void updateBook(Book book) {
        for (Book book1 : bookShelves) {
            if (book1.equals(book)) {
                book.setGenre(book.getGenre());
                book.setTitle(book.getTitle());
                book.setAuthor(book.getAuthor());
            }

        }
    }

    public void removeBook(Book book2) {
        bookShelves.remove(book2);
    }


    public boolean isAMemberAvailable(String name) {
        boolean memberIsAvailable;
        for (Member member: members) {
            memberIsAvailable =  member.getName().equalsIgnoreCase(name);
            if (memberIsAvailable) { isMemberAvailable = true; break;}
            else { isMemberAvailable = false;}
        }
        return isMemberAvailable;
    }

    public void removeMember(Member member) {
        members.remove(member);
    }

    public void updateMemberInfornation(Member member2) {
        for (Member member : members){
            if (member2.equals(member)) {
                member2.setName(member2.getName());
                member2.setContactInformation(member2.getContactInformation());
            }

        }
    }


    public void borrowBook(Book book1, Member member1, String dueDate) {
            for (Book book : bookShelves) {
                if (book.isAvailable()) {
                if (book.equals(book1)) {
                    Transaction transaction = new Transaction(book1, member1, dueDate);
                    transactions.add(transaction);
                    member1.getBorrowingHistory().add(transaction);
                    bookShelves.remove(book1);
                }
            }

        }

    }

    public void returnBook(Transaction transaction) {
        for (Book book : bookShelves) {
            if (!book.isAvailable()) {
                    for (Transaction transaction1 : transactions) {
                        if (transaction.equals(transaction1)) {
                    transactions.remove(transaction);
                }
            }}

        }
    }
}
