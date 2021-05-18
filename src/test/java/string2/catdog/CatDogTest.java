package string2.catdog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatDogTest {

    @Test
    void testTrue() {
        String input = "1cat3izdog";
        assertTrue(new CatDog().catDog(input));
    }

    @Test
    void testFalse() {
        String input = "fcatkd9dogbd7jdogni";
        assertFalse(new CatDog().catDog(input));
    }

}