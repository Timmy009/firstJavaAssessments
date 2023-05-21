package tdd;

import assignment.CreditCard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditCardTest {
    CreditCard creditCard;

    @BeforeEach
    public void setUp() {
        creditCard = new CreditCard();
    }
    @Test
    public void creditCardLenght() {
        String creditCard1 = "65768467584799";

    assertEquals("The length is valid",  creditCard.validateLenght(creditCard1));
    }
    @Test
    public void creditCardLenghtTwo() {
        String creditCard1 = "657684675847999999999";

        assertEquals("The length is not valid",  creditCard.validateLenght(creditCard1));
    }
    @Test
    public void creditCardTypeVisatTwo() {
        String creditCard1 = "45768467584799";

        assertEquals("VisaCard",  creditCard.validateCardType(creditCard1));
    }
    @Test
    public void creditCardTypeMasterTwo() {
        String creditCard1 = "5768467584799";

        assertEquals("MasterCard",  creditCard.validateCardType(creditCard1));
    }
    @Test
    public void creditCardTypeAmericaTwo() {
        String creditCard1 = "3768467584799";

        assertEquals("American Express Card",  creditCard.validateCardType(creditCard1));
    }
    @Test
    public void creditCardTypeDiscoverTwo() {
        String creditCard1 = "6768467584799";

        assertEquals("Discover Card",  creditCard.validateCardType(creditCard1));
    }

    @Test
    public void creditCardTypeInvalidTwo() {
        String creditCard1 = "0768467584799";
        assertEquals("Invalid Card Type",  creditCard.validateCardType(creditCard1));
    }
    @Test
    public void creditCardSingleNumberAddUp() {
        String creditCard1 = "4388576018402626";
        assertEquals(37,  creditCard.doublingEverySecondDigit(creditCard1));
    }
    @Test
    public void creditCardOddPositionNumberAddUp() {
        String creditCard1 = "4388576018402626";
        assertEquals(38,  creditCard.addDigitInOddPosition(creditCard1));
    }
    @Test
    public void creditCardAdd() {
        String creditCard1 = "4388576018402626";
        assertEquals(75,  creditCard.numberAtOddPositionAndSingleDigit(creditCard1));
    }
    @Test
    public void creditCardValidate() {
        String creditCard1 = "4388576018410707";
        assertEquals("Valid",  creditCard.validate(creditCard1));
    }
    @Test
    public void invalidCreditCardValidate() {
        String creditCard1 = "4388576018402626";
        assertEquals("Invalid",  creditCard.validate(creditCard1));
    }



}
