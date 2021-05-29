package array2.sum67;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sum67Test {

    @Test
    void test() {
        int[] input = {1, 1, 6, 7, 2};
        int expected = 4;
        assertEquals(expected, new Sum67().sum67(input));
    }

    @Test
    void test2() {
        int[] input = {1, 2, 2, 6, 99, 99, 7};
        int expected = 5;
        assertEquals(expected, new Sum67().sum67(input));
    }

    @Test
    void test3() {
        int[] input = {2, 7, 6, 2, 6, 7, 2, 7};
        int expected = 18;
        assertEquals(expected, new Sum67().sum67(input));
    }

}