package array2.has77;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Has77Test {

    @Test
    void test() {
        int[] input = {1, 7, 7};
        assertTrue(new Has77().has77(input));
    }

    @Test
    void test2() {
        int[] input = {1, 7, 1, 1, 7};
        assertFalse(new Has77().has77(input));
    }

}