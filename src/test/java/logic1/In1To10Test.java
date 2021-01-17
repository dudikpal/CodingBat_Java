package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class In1To10Test {

    @Test
    void in1To10() {
        int n = 11;
        boolean outSideMode = true;

        assertTrue(new In1To10().in1To10(n, outSideMode));
    }
}