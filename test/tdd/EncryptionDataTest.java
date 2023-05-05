package tdd;

import chapterFour.EncryptionData;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncryptionDataTest {
    EncryptionData encryptionData = new EncryptionData();

    @Test
    public void EncrytptionTest () {
        String EncryptionData = encryptionData.encryptData("0149");
        assertEquals("1678", EncryptionData);
    }

}
