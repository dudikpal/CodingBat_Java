package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxTripleTest {

    @Test
    void maxTriple() {
        int[] nums = {1, 2, 3, 4, 5};

        assertEquals(5, new MaxTriple().maxTriple(nums));
    }
}