package array2.only14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Only14Test {

    @Test
    void test() {
        int[] input = {1, 4, 1, 4};
        assertTrue(new Only14().only14(input));
    }

    @Test
    void test2() {
        int[] input = {1, 4, 2, 4};
        assertFalse(new Only14().only14(input));
    }

}