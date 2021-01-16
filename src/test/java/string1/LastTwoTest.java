package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastTwoTest {

    @Test
    void lastTwo() {
        String str = "coding";

        assertEquals("codign", new LastTwo().lastTwo(str));
    }
}