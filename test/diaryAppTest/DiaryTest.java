package diaryAppTest;

import diaryApp.Diary;
import diaryApp.Gist;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    private Diary diary;

    @BeforeEach public void startWith() {
    diary = new Diary ("username", "password"); }

    @Test public void testThatADiaryExists() {
        assertNotNull(diary);
    }

    @Test public void diaryIsLockedByDefaultTest() {
        assertTrue(diary.isLocked());
    }

    @Test public void unlockedDiaryTWithPasswordTest() {
        diary.unlockDiaryWith("password");
        assertFalse(diary.isLocked());
    }
    @Test public void LockedDiaryTest() {
        diary.unlockDiaryWith("password");
        assertFalse(diary.isLocked());
        diary.lockedDiary();
        assertTrue(diary.isLocked());
    }

    @Test public void testForDiaryCannotBeUnlockedWithWrongPassword() {
        diary.lockedDiary();
        assertTrue(diary.isLocked());
        diary.unlockDiaryWith("timimmd");
        assertTrue(diary.isLocked());
    }

    @Test public void unlockedDiaryCanAddEntry() {
        diary.unlockDiaryWith("password");
        assertFalse(diary.isLocked());
        diary.addGist("My day", "Welcom oh");
        assertEquals(1, diary.gistCount());
    }
    @Test public void deleteGistTest() {
        diary.unlockDiaryWith("password");
        assertFalse(diary.isLocked());
        diary.addGist("My day", "Welcom oh");
        diary.addGist("My Week", "I will be there");
        diary.deleteGist(1);
        assertEquals(1, diary.gistCount());
    }

    @Test public void initialCapacity () {
        assertEquals(0, diary.gistCount());
    }

    @Test public void deleteGistTestZero() {
        diary.unlockDiaryWith("password");
        assertFalse(diary.isLocked());
        diary.addGist("My Week", "I will be there");
        diary.deleteGist(1);
        assertEquals(0, diary.gistCount());
    }



    @Test public void findGistTest () {
        diary.unlockDiaryWith("password");
        assertFalse(diary.isLocked());
        diary.addGist("My day", "Welcom oh");
        diary.addGist("My Week", "I will be there");
        Gist body = diary.findGistByTitle("My day");
        assertEquals("Welcom oh", body.getBody());
    }
    @Test public void updateEntryTest() {
        diary.unlockDiaryWith("password");
        assertFalse(diary.isLocked());
        diary.addGist("My day", "Welcom oh");
        diary.addGist("My Week", "I will be there");
        diary.updateEntry(1, "Today", "I am fine");
        Gist body = diary.findGistByTitle("Today");
        assertEquals("I am fine", body.getBody());
    }
}
