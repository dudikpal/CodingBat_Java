package array2.zeromax;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZeroMaxTest {

    @Test
    void test() {
        int[] input = {0, 5, 0, 3};
        int[] expected = {5, 5, 3, 3};
        assertArrayEquals(expected, new ZeroMax().zeroMax(input));
    }

    @Test
    void test2() {
        int[] input = {7, 0, 4, 3, 0, 2};
        int[] expected = {7, 3, 4, 3, 0, 2};
        assertArrayEquals(expected, new ZeroMax().zeroMax(input));
    }

}