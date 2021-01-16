package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Makes10Test {

    @Test
    void makes10() {
        Makes10 makes10 = new Makes10();

        int a = 1;
        int b = 9;

        assertTrue(makes10.makes10(a, b));
    }
}