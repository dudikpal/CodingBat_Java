package array2.has22;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Has22Test {

    @Test
    void testTrue() {
        int[] input = {1, 2, 2};
        assertTrue(new Has22().has22(input));
    }

    @Test
    void testFalse() {
        int[] input = {1, 2, 1, 2};
        assertFalse(new Has22().has22(input));
    }

}