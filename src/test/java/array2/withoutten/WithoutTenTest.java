package array2.withoutten;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithoutTenTest {

    @Test
    void test() {
        int[] input = {1, 10, 10, 2};
        int[] expected = {1, 2, 0, 0};
        assertArrayEquals(expected, new WithoutTen().withoutTen(input));
    }

}