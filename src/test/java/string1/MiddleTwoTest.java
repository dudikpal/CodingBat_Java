package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleTwoTest {

    @Test
    void middleTwo() {
        String str = "Hellók";

        assertEquals("ll", new MiddleTwo().middleTwo(str));
    }
}