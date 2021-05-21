package array2.fizzarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzArrayTest {

    @Test
    void test() {
        int input = 9;
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        assertArrayEquals(expected, new FizzArray().fizzArray(input));
    }

}