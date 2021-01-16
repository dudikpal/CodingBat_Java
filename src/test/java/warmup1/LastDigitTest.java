package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastDigitTest {

    @Test
    void lastDigit() {
        LastDigit lastDigit = new LastDigit();

        int a = 1246;
        int b = 56;

        assertTrue(lastDigit.lastDigit(a, b));
    }
}