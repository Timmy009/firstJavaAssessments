package diaryApp;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String userName;
    private String passWord;
    private boolean isLocked = true;
    private List<Gist> gists = new ArrayList<>();
    private int count;

    public Diary(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }



    public boolean isLocked() {
        return isLocked;
    }

    public void lockedDiary() {
          isLocked = true;
    }

    public void unlockDiaryWith(String passWord) {
        boolean passwordIsCorrect = passWord.equalsIgnoreCase(this.passWord);
        if (passwordIsCorrect) unlockDiary();
    }
    private boolean unlockDiary () {
        return isLocked = false;
    }
public void addGist(String title, String body) {
        boolean diaryIsUnlocked = !isLocked;
        if (diaryIsUnlocked) {
        Gist newGist = new Gist(title, body);
        gists.add(newGist);
        count++;
        newGist.setId(count);
}}
public int gistCount() {
        return gists.size();
}

    public String getPassWord() {
        return passWord;
    }

    public void deleteGist (String title) {
    boolean diaryIsUnlocked = !isLocked;
    if (diaryIsUnlocked) {
    for (Gist gist: gists) {
        if (gist.getTitle()==(title)) {
            gists.remove(gist);
            break;

        }}
    }
}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Gist findGistByTitle(String myGist){
        boolean diaryIsUnlocked = !isLocked;
        if (diaryIsUnlocked) {
            for (Gist gist: gists) {
                if (gist.getTitle().equalsIgnoreCase(myGist)) {
                    return gist;
                }
            }
        }
        return null;
    }

    public void updateEntry(int id, String title, String body) {
        boolean diaryIsUnlocked = !isLocked;
        if (diaryIsUnlocked) {
            for (Gist gist: gists) {
                if (gist.getId() == id) {
                    gist.setBody(body);
                    gist.setTitle(title);
                }
            }

        }
        }

    }

