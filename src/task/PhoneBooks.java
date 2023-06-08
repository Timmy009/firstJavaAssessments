package task;

import java.util.ArrayList;
import java.util.List;

public class PhoneBooks {

    private List <PhoneBook> phoneBooks = new ArrayList<>();
    private List <String> passwords = new ArrayList<>();

    public void createPhoneBook (String password, String userName) {

        PhoneBook phoneBook = new PhoneBook(password, userName);
        phoneBooks.add(phoneBook);
        passwords.add(password);
    }

    public List <PhoneBook> getAllPhoneBook () {
        return  phoneBooks;
    }
    public void unlockAllPhoneBooks () {
        for (int count = 0; count < phoneBooks.size(); count++) {
            getAllPhoneBook().get(count).unlockPhoneBook(passwords.get(count));
        }

    }

}
