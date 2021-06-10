package array2.evenodd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOddTest {

    @Test
    void test() {
        int[] input = {3, 3, 2};
        int[] expected = {2, 3, 3};
        assertArrayEquals(expected, new EvenOdd().evenOdd(input));
    }

}