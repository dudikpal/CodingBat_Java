package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstTwoTest {

    @Test
    void firstTwo() {
        String word = "y";

        assertEquals("y", new FirstTwo().firstTwo(word));
    }
}