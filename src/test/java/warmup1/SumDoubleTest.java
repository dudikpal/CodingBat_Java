package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumDoubleTest {

    @Test
    void sumDouble() {
        SumDouble sumDouble = new SumDouble();

        int a = 3;
        int b = 3;

        assertEquals(12, sumDouble.sumDouble(a, b));
    }
}