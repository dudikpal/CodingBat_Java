package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class In3050Test {

    @Test
    void in3050() {
        In3050 in3050 = new In3050();

        int a = 40;
        int b = 50;

        assertTrue(in3050.in3050(a, b));
    }
}