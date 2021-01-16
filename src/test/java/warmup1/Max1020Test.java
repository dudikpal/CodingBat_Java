package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Max1020Test {

    @Test
    void max1020() {
        Max1020 max1020 = new Max1020();

        int a = 21;
        int b = 10;

        assertEquals(10, max1020.max1020(a, b));
    }
}