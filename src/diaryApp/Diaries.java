package diaryApp;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
   private final List <Diary> diaries = new ArrayList<>();


public void addDiary(String password, String username) {
   Diary newDiary = new Diary(password, username);
   diaries.add(newDiary);

}

public Diary findByUsername(String username) {
   for (Diary diary: diaries) {
      if (diary.getUserName().equals(username)) {
         return diary;
      }
   }
return null;
}

public void deleteDiary (String username, String password) {
   for (Diary diary: diaries) {
      if (diary.getUserName().equals(username) && diary.getPassWord().equals(password)){
         diaries.remove(diary);
      }}
}
}