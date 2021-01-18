package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoAsOneTest {

    @Test
    void twoAsOne() {
        int a = 1;
        int b = 2;
        int c = 3;

        assertTrue(new TwoAsOne().twoAsOne(a, b, c));
    }
}