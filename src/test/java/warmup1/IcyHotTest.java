package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IcyHotTest {

    @Test
    void icyHot() {
        IcyHot ih = new IcyHot();

        int temp1 = -1;
        int temp2 = 101;

        assertTrue(ih.icyHot(temp1, temp2));
    }
}