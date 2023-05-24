package libraryInformationSystemTest;

import libraryInformaionSystem.Book;
import libraryInformaionSystem.Library;
import libraryInformaionSystem.Member;
import libraryInformaionSystem.Transaction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.sound.midi.Track;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;
    @BeforeEach
    public void startWith() {
        library = new Library();
    }

    @Test public void testThatLibraryExist() {
        assertNotNull(library);
    }
    @Test public void testThatNoBookInTheShelvesInTheLibrary() {
        assertTrue(library.isBookShelveEmpty());
    }
    @Test public void addBookToTheShelvesTest() {
        Book book1 = new Book("English Language", "Timileyin", "SCE");
        library.addBook(book1);
        assertFalse(library.isBookShelveEmpty());
    }

    @Test public void searchBookTest() {
        Book book1 = new Book("English Language", "Timileyin", "SCE");
        Book book2 = new Book("Mathematics", "Esther", "MTH");
        library.addBook(book1);
        library.addBook(book2);
        assertFalse(library.isAvailable("SOS"));
    }
    @Test public void searchBookTestTwo() {
        Book book1 = new Book("English Language", "Timileyin", "SCE");
        Book book2 = new Book("Mathematics", "Esther", "MTH");
        library.addBook(book1);
        library.addBook(book2);
        assertTrue(library.isAvailable("Mathematics"));
    }
    @Test public void updateBookTest () {
        Book book1 = new Book("English Language", "Timileyin", "SCE");
        Book book2 = new Book("Mathematics", "Esther", "MTH");
        library.addBook(book1);
        library.addBook(book2);
        library.updateBook(book1);
        book1.setAuthor("Tunde");
        book1.setGenre("INS");
        book1.setTitle("Insurance");
        assertTrue(library.isAvailable("Insurance"));
    }
@Test public void removeBookTest () {
    Book book1 = new Book("English Language", "Timileyin", "SCE");
    Book book2 = new Book("Mathematics", "Esther", "MTH");
    library.addBook(book1);
    library.addBook(book2);
    assertTrue(library.isAvailable("Mathematics"));
    library.removeBook(book2);
    assertFalse(library.isAvailable("Mathematics"));

}
    @Test public void testThatNoMemberInTheLibrary() {
        assertTrue(library.isMemberListEmpty());
    }

    @Test public void addMemberToTheShelvesTest() {
        Member member1 = new Member("Torin", "08069547786");
        library.addMember(member1);
        assertFalse(library.isMemberListEmpty());
    }

    @Test public void searchMemberTest() {
        Member member1 = new Member("Torin", "08069547786");
        Member member2 = new Member("Timi", "0904583874w");
        library.addMember(member1);
        library.addMember(member2);
        assertFalse(library.isAMemberAvailable("ESTHER"));
    }

    @Test public void searchMemberTestTwo() {
        Member member1 = new Member("Torin", "08069547786");
        Member member2 = new Member("Timi", "0904583874w");
        library.addMember(member1);
        library.addMember(member2);
        assertTrue(library.isAMemberAvailable("TIMI"));
    }

    @Test public void removeMemberTest () {
        Member member1 = new Member("Torin", "08069547786");
        Member member2 = new Member("Timi", "0904583874w");
        library.addMember(member1);
        library.addMember(member2);
        assertTrue(library.isAMemberAvailable("TIMI"));
        library.removeMember(member2);
        assertFalse(library.isAMemberAvailable("TIMI"));

    }
    @Test public void updateMemberTest () {
        Member member1 = new Member("Torin", "08069547786");
        Member member2 = new Member("Timi", "0904583874w");
        library.addMember(member1);
        library.addMember(member2);
        library.updateMemberInfornation(member2);
        member2.setName("Korede");
        member2.setContactInformation("7848747");
        assertTrue(library.isAMemberAvailable("KOREDE"));

    }
    @Test public void borrowBookTest() {
        Member member1 = new Member("Torin", "08069547786");
        Member member2 = new Member("Timi", "0904583874w");
        library.addMember(member1);
        library.addMember(member2);
        Book book1 = new Book("English Language", "Timileyin", "SCE");
        Book book2 = new Book("Mathematics", "Esther", "MTH");
        library.addBook(book1);
        library.addBook(book2);
        library.borrowBook(book1, member1, "23");
        assertFalse(library.isAvailable("English Language"));

}
//@Test public void returnBookTest () {
//    Member member1 = new Member("Torin", "08069547786");
//    Member member2 = new Member("Timi", "0904583874w");
//    library.addMember(member1);
//    library.addMember(member2);
//    Book book1 = new Book("English Language", "Timileyin", "SCE");
//    Book book2 = new Book("Mathematics", "Esther", "MTH");
//    library.addBook(book1);
//    library.addBook(book2);
//    library.borrowBook(book1, member1, "23");
//    assertFalse(library.isAvailable("English Language"));
//    Transaction transaction = new Transaction(book1, member1, "56");
//    library.returnBook(transaction);
//    assertTrue(library.isAvailable("English Language"));
//
//
//
//}

}
