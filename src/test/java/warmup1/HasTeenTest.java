package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HasTeenTest {

    @Test
    void hasTeen() {
        HasTeen ht = new HasTeen();

        int a = 13;
        int b = 20;
        int c = 10;

        assertTrue(ht.hasTeen(a, b, c));
    }
}