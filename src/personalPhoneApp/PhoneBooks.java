package personalPhoneApp;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class PhoneBooks {
    List<PhoneBook> phoneBooks;

    public PhoneBooks () {
        phoneBooks = new ArrayList<>();
    }
    private void generatePrimaryKey () {
        SecureRandom random = new SecureRandom();
        int  randomKey = random.nextInt(100);
        for (PhoneBook phoneBook : phoneBooks) {
            if (phoneBook.getPrimaryKey()!=randomKey) {
                phoneBook.setPrimaryKey(randomKey);
            }
        }

    }


    public void createPhoneBook () {
        PhoneBook phoneBook = new PhoneBook();
        phoneBooks.add(phoneBook);

    }

    public List<PhoneBook> readPhoneBook () {
        return phoneBooks;
    }



    public void deletePhoneBook (int primaryKey) {
        for (PhoneBook phoneBook : phoneBooks) {
            if (phoneBook.getPrimaryKey() == primaryKey) {
                phoneBooks.remove(phoneBook);
            }
        }
    }



}
