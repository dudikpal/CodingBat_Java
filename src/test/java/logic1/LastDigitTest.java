package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastDigitTest {

    @Test
    void lastDigit() {
        int a = 23;
        int b = 19;
        int c = 3;

        assertTrue(new LastDigit().lastDigit(a, b, c));
    }
}