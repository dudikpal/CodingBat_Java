package array2.countevens;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountEvensTest {

    @Test
    void test() {
        int[] input = {2, 1, 2, 3, 4};
        int expected = 3;
        assertEquals(expected, new CountEvens().countEvens(input));
    }

}