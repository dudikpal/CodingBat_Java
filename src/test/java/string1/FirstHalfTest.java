package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstHalfTest {

    @Test
    void firstHalf() {
        String word = "HelloThere";

        assertEquals("Hello", new FirstHalf().firstHalf(word));
    }
}