package array2.shiftleft;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShiftLeftTest {

    @Test
    void test() {
        int[] input = {6, 2, 5, 3};
        int[] expected = {2, 5, 3, 6};
        assertArrayEquals(expected, new ShiftLeft().shiftLeft(input));
    }

}