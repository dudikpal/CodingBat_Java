package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InOrderEqualTest {

    @Test
    void inOrder() {
        int a = 1;
        int b = 1;
        int c = 2;
        boolean bOk = true;

        assertTrue(new InOrderEqual().inOrder(a, b, c, bOk));
    }
}