package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumLimitTest {

    @Test
    void sumLimit() {
        int a = 18;
        int b = 123;

        assertEquals(18, new SumLimit().sumLimit(a, b));
    }
}