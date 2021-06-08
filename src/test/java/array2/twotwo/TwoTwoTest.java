package array2.twotwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoTwoTest {

    @Test
    void testTrue() {
        int[] input = {4, 2, 2, 3};
        assertTrue(new TwoTwo().twoTwo(input));
    }

    @Test
    void testFalse() {
        int[] input = {2, 2, 4, 2};
        assertFalse(new TwoTwo().twoTwo(input));
    }

}