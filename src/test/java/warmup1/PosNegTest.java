package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosNegTest {

    @Test
    void posNeg() {
        PosNeg posNeg = new PosNeg();

        int a = -1;
        int b = 1;
        boolean negative = true;

        assertFalse(posNeg.posNeg(a, b, negative));
    }
}