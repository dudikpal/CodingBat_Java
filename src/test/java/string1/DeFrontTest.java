package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeFrontTest {

    @Test
    void deFront() {
        String str = "away";

        assertEquals("aay", new DeFront().deFront(str));
    }
}