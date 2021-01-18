package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InOrderEqualTest {

    @Test
    void inOrderEqual() {
        int a = 5;
        int b = 5;
        int c = 7;
        boolean equalOk = true;

        assertTrue(new InOrderEqual().inOrderEqual(a, b, c, equalOk));
    }
}