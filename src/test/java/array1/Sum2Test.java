package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sum2Test {

    @Test
    void sum2() {
        int[] nums = {1, 2, 3};

        assertEquals(3, new Sum2().sum2(nums));
    }
}