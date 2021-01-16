package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntMaxTest {

    @Test
    void intMax() {
        IntMax im = new IntMax();

        int a = 1;
        int b = 2;
        int c = 3;

        assertEquals(3, im.intMax(a, b, c));
    }
}