package personalPhoneApp;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> contactList = new ArrayList<>();
    private List<Contact> favouritesContacts = new ArrayList<>();
    private List<Contact> recentContacts = new ArrayList<>();
    private List<Contact> emergencyContacts = new ArrayList<>();
    private List<Contact> duplicateContacts = new ArrayList<>();
    private List<Contact> blockedContacts = new ArrayList<>();
    private int primaryKey;


    public int getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(int primaryKey) {
        this.primaryKey = primaryKey;
    }

    public void createContact (String firstname, String lastName, String phoneNumber) {
        Contact newContact = new Contact(firstname, lastName, phoneNumber);
        contactList.add(newContact);
        newContact.setPrimaryKey(contactList.size());
    }
    private void generatePrimaryKey () {
        SecureRandom random = new SecureRandom();
        int  randomKey = random.nextInt(100);
        for (Contact contact : contactList) {
            if (contact.getPrimaryKey()!=randomKey) {
                contact.setPrimaryKey(randomKey);
            }
        }

    }

    public void addFavourites (String name) {
       favouritesContacts.add(findContact(name));
    }

    public Contact findContact (String firstName) {
        for (Contact contact : contactList) {
            if (contact.getFirstName().equals(firstName)) {
                return contact;
            }
        }
        throw new IllegalArgumentException("No contact found");
    }

    public int getContactNumber () {
        return contactList.size();
    }
    public int getFNumberOfFavouritesContact () {
        return favouritesContacts.size();
    }

    public void deleteContact(String name) {
      contactList.remove(findContact(name));
    }

    public ArrayList<Contact> findContactByName(String firstName) {
        ArrayList <Contact> foundContacts = new ArrayList<>();
        for (Contact contact : contactList) {
            if (contact.getFirstName().equals(firstName)) {
                foundContacts.add(contact);
            }

        }
        return foundContacts;
    }
    public List<Contact> displayAllContact () {
        return contactList;
    }


//    public List<Contact> displayAllContactAlphabetically () {
//        for (int count = 0; count < contactList.size(); count++) {
//
//            for (int countTwo = count + 1; countTwo < contactList.size(); countTwo++) {
//
//        if (Character.valueOf(contactList.get(count).getFirstName().charAt(0)) > Character.valueOf(contactList.get(countTwo).getFirstName().charAt(0)))
//                {
//
//                }
//            }
//        }
//        return contactList;
//    }

    public Contact findContactByIndex (String name, int index) {
        Contact foundContact = findContactByName(name).get(index);
        return foundContact;
    }

    public List<Contact> viewDuplicatesContacts () {
        for (int count = 0; count < contactList.size(); count++) {
            for (int countTwo = count + 1; countTwo < contactList.size(); countTwo++) {
    if (contactList.get(count).getPhoneNumber().equals( contactList.get(countTwo).getPhoneNumber())) {
        duplicateContacts.add(contactList.get(count));
    }

            }

        }
        return duplicateContacts;
    }

    public int numberOfDuplicateContact () {
        return duplicateContacts.size();
    }




    public List<Contact> getFavouritesContacts() {
        return favouritesContacts;
    }



//    public void addEmergency(String name) {
//        emergencyContacts.add(findContact(name));
//    }
    public List<Contact> emergencyContact () {
        return emergencyContacts;
    }

    public int numberOfEmergencyContact () {
        return emergencyContacts.size();
    }
//
    public void updateContactInformation(String oldFirstName, String newFirstName, String lastName, String email, String address, String birthday, String socialProfile) {
        findContact(oldFirstName).setFirstName(newFirstName);
        findContact(oldFirstName).setLastName(lastName);
        findContact(oldFirstName).setEmail(email);
        findContact(oldFirstName).setAddress(address);
        findContact(oldFirstName).setBirthday(birthday);
        findContact(oldFirstName).setSocialProfile(socialProfile);
    }
public void blockContact (String name) {
        blockedContacts.add(findContact(name));
}
    public Contact findBlockedContact(String name) {
        for (Contact contact : blockedContacts) {
            if (contact.getFirstName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        throw new IllegalArgumentException("Number has not been blocked");
    }
public int numberOfBlockedContact () {
        return blockedContacts.size();
}





}
