package array2.either24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Either24Test {

    @Test
    void testTrue() {
        int[] input = {1, 2, 2};

        Either24 either24 = new Either24();

        assertTrue(either24.either24(input));
    }

    @Test
    void testFalse() {
        int[] input = {4, 4, 1, 2, 2};

        Either24 either24 = new Either24();

        assertFalse(either24.either24(input));
    }

}