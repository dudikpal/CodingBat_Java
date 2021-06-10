package array2.zerofront;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZeroFrontTest {

    @Test
    void test() {
        int[] input = {0, 1, 1, 0, 1};
        int[] expected = {0, 0, 1, 1, 1};
        assertArrayEquals(expected, new ZeroFront().zeroFront(input));
    }

}