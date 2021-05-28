package array2.modthree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModThreeTest {

    @Test
    void testTrue() {
        int[] input = {2, 1, 3, 5};
        assertTrue(new ModThree().modThree(input));
    }

    @Test
    void testFalse() {
        int[] input = {2, 1, 2, 5};
        assertFalse(new ModThree().modThree(input));
    }

    @Test
    void testTrue2() {
        int[] input = {2, 4, 2, 5};
        assertTrue(new ModThree().modThree(input));
    }

}