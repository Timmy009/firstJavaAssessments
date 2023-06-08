package personalPhoneApp;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {


    private PhoneBook phoneBook;

    @BeforeEach
    public void startWith() {
        phoneBook = new PhoneBook();
    }

    @Test
    public void testForCreateContact() {
        phoneBook.createContact("Timi", "Bamgbose", "09024943627");
        assertEquals(1, phoneBook.getContactNumber());
    }

    @Test
    public void testForCreateTWOContact() {
        phoneBook.createContact("Timi", "Kay", "09024943627");
        phoneBook.createContact("Daniel", "Mike", "08069547786");
        phoneBook.createContact("Timi", "Peace", "08148517717");
        assertEquals(3, phoneBook.getContactNumber());
    }

//    @Test
//    public void testForFindContact() {
//        phoneBook.createContact("Timi", "Kay", "09024943627");
//        phoneBook.createContact("Daniel", "Mike", "08069547786");
//        phoneBook.createContact("Timi", "Peace", "08148517717");
//        System.out.println(phoneBook.findContactByName("Timi"));
//        assertEquals("[Timi Kay\n, Timi Peace\n]", phoneBook.findContactByName("Timi"));
//    }

    @Test
    public void addToFavouriteTest() {
        phoneBook.createContact("Timi", "Kay", "09024943627");
        phoneBook.createContact("Daniel", "Mike", "08069547786");
        phoneBook.createContact("Timi", "Peace", "08148517717");
        phoneBook.addFavourites("Timi");
        assertEquals(1, phoneBook.getFNumberOfFavouritesContact());

    }

    @Test
    public void testForDeleteContact() {
        phoneBook.createContact("Timi", "Kay", "09024943627");
        phoneBook.createContact("Daniel", "Mike", "08069547786");
        phoneBook.createContact("Timi", "Peace", "08148517717");
        phoneBook.deleteContact("Daniel");
        assertEquals(2, phoneBook.getContactNumber());
    }

    @Test
    public void testToCheckForDuplicatesContact() {
        phoneBook.createContact("Timi", "Kay", "09024943627");
        phoneBook.createContact("Daniel", "Mike", "08069547786");
        phoneBook.createContact("Timi", "Peace", "08148517717");
        phoneBook.createContact("Timi", "Peace", "08148517717");
        phoneBook.viewDuplicatesContacts();
        assertEquals(1, phoneBook.numberOfDuplicateContact());
    }




    @Test
    public void testForUpdateContactCalls() {
        phoneBook.createContact("Timi", "Kay", "09024943627");
        phoneBook.createContact("Daniel", "Mike", "08069547786");
        phoneBook.createContact("Timi", "Peace", "08148517717");
      phoneBook.updateContactInformation("Timi", "newFirstName", "newLastName", "email", "address", "birthday", "socialProfile");
        assertEquals ("newFirstName", phoneBook.findContact("newFirstName").getFirstName());
    }
    @Test
    public void testForBlockedContactCalls() {
        phoneBook.createContact("Timi", "Kay", "09024943627");
        phoneBook.createContact("Daniel", "Mike", "08069547786");
        phoneBook.createContact("Timi", "Peace", "08148517717");
        phoneBook.blockContact("Timi");
        assertEquals(1, phoneBook.numberOfBlockedContact());

    }



}