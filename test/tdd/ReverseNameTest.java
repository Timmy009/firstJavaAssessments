package tdd;

import assignment.NameReverser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ReverseNameTest {
    private NameReverser nameReverser;
    @BeforeEach
    public void setUp () {
        nameReverser = new NameReverser();
        assertNotNull(nameReverser);
    }
    @Test
    public void nameReverseTest () {
        nameReverser.setName("Timileyin");
        assertEquals("niyelimiT", nameReverser.nameReverse());
    }
}
