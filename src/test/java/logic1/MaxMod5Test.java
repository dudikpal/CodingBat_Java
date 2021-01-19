package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxMod5Test {

    @Test
    void maxMod5() {
        int a = 3;
        int b = 8;

        assertEquals(3, new MaxMod5().maxMod5(a, b));
    }
}