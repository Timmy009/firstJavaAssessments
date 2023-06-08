package task;

public class PhoneBook {
    private boolean isLocked = true;
    private String password;
    private String userName;


    public PhoneBook(String password, String userName) {
        this.password = password;
        this.userName = userName;
    }

    public void unlockPhoneBook (String password) {
        if (this.password.equals(password)) {
            isLocked = false;
        }
    }
    public boolean isLocked () {
        return isLocked;
    }

}
