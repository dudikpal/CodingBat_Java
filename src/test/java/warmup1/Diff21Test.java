package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Diff21Test {

    @Test
    void diff21() {
        Diff21 diff21 = new Diff21();

        int n = 30;

        assertEquals(18, diff21.diff21(n));
    }
}