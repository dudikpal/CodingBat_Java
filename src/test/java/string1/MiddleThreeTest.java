package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleThreeTest {

    @Test
    void middleThree() {
        String str = "yahoo";

        assertEquals("aho", new MiddleThree().middleThree(str));
    }
}