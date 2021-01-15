package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class In1020Test {

    @Test
    void in1020() {
        In1020 in1020 = new In1020();

        int numberA = 18;
        int numberB = 99;

        assertTrue(in1020.in1020(numberA, numberB));

    }
}