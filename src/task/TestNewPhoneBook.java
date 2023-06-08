package task;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestNewPhoneBook {

    PhoneBooks phoneBooks;

    @BeforeEach
    public void startWith () {
        phoneBooks = new PhoneBooks();
    }
    @Test
    public void phoneBooksAreLockByDefault () {
        phoneBooks.createPhoneBook("1122", "timmy");
        phoneBooks.createPhoneBook("2233", "esther");
        phoneBooks.createPhoneBook("3344", "mariam");
        assertTrue (phoneBooks.getAllPhoneBook().get(0).isLocked());
    }


    @Test
    public void unlockPhoneBooks () {
        phoneBooks.createPhoneBook("1122", "timmy");
        phoneBooks.createPhoneBook("2233", "esther");
        phoneBooks.createPhoneBook("3344", "mariam");
        phoneBooks.unlockAllPhoneBooks();
        for (int count = 0; count < 3; count++) {
        assertFalse (phoneBooks.getAllPhoneBook().get(count).isLocked());
    }}
}
