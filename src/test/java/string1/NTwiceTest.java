package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NTwiceTest {

    @Test
    void nTwice() {
        String str = "Chocolate";
        int n = 3;

        assertEquals("Choate", new NTwice().nTwice(str, n));
    }
}