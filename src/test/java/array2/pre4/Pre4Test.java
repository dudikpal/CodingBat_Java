package array2.pre4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pre4Test {

    @Test
    void test() {
        int[] input = {1, 2, 4, 1};
        int[] expected = {1, 2};
        assertArrayEquals(expected, new Pre4().pre4(input));
    }

}