package array2.tenrun;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TenRunTest {

    @Test
    void test() {
        int[] input = {2, 10, 3, 4, 20, 5};
        int[] expected = {2, 10, 10, 10, 20, 20};
        assertArrayEquals(expected, new TenRun().tenRun(input));
    }

    @Test
    void test2() {
        int[] input = {10, 1, 20, 2};
        int[] expected = {10, 10, 20, 20};
        assertArrayEquals(expected, new TenRun().tenRun(input));
    }

    @Test
    void test3() {
        int[] input = {1, 2, 50, 1};
        int[] expected = {1, 2, 50, 50};
        assertArrayEquals(expected, new TenRun().tenRun(input));
    }

}