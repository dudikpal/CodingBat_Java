package array2.bigdiff;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigDiffTest {

    @Test
    void test() {
        int[] input = {10, 3, 5, 6};
        int expected = 7;
        assertEquals(expected, new BigDiff().bigDiff(input));
    }

}