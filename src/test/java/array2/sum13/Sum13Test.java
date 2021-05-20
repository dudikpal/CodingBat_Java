package array2.sum13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sum13Test {

    @Test
    void test() {
        int[] input = {1, 2, 2, 1};
        int expected = 6;
        assertEquals(expected, new Sum13().sum13(input));
    }

    @Test
    void test2() {
        int[] input = {1, 2, 2, 1, 13};
        int expected = 6;
        assertEquals(expected, new Sum13().sum13(input));
    }

}