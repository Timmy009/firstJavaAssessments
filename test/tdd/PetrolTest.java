package tdd;

import chapterThree.PetrolPurchase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetrolTest {
    PetrolPurchase petrolPurchase = new PetrolPurchase("Yaba", "Diesel", 7, 1000, 10);



    @Test
    public void amountTest () {
        assertEquals (6300, petrolPurchase.getPurchaseAmount());
    }
}
