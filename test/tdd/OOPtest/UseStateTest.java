package tdd.OOPtest;

import OOP.Nigeria;
import OOP.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static OOP.Nigeria.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UseStateTest {
    User user;

    @BeforeEach
    public void setUp() {
        user = new User();
    }
    @Test
    public void userStateTest() {
        user.setState("Kano");
        assertEquals(NORTH_WEST, user.getState());
    }
    @Test
    public void userStateTestTwo() {
        user.setState("Lagos");
        assertEquals(SOUTH_WEST, user.getState());
    }

}
