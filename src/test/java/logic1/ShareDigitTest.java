package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShareDigitTest {

    @Test
    void shareDigit() {
        int a = 18;
        int b = 80;

        assertTrue(new ShareDigit().shareDigit(a, b));
    }
}