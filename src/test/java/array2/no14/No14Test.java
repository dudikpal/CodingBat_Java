package array2.no14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class No14Test {

    @Test
    void testFalse() {
        int[] input = {1, 2, 3, 4};
        assertFalse(new No14().no14(input));
    }

    @Test
    void testTrue1() {
        int[] input = {1, 2, 3, 5};
        assertTrue(new No14().no14(input));
    }

    @Test
    void testTrue4() {
        int[] input = {0, 2, 3, 4};
        assertTrue(new No14().no14(input));
    }

}