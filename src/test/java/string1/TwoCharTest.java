package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoCharTest {

    @Test
    void twoChar() {
        String str = "yahoo";
        int index = 2;

        assertEquals("ho", new TwoChar().twoChar(str, index));
    }
}