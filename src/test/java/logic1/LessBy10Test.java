package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LessBy10Test {

    @Test
    void lessBy10() {
        int a = 11;
        int b = 1;
        int c = 7;

        assertTrue(new LessBy10().lessBy10(a, b, c));
    }
}