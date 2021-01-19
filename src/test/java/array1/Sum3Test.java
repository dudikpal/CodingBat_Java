package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sum3Test {

    @Test
    void sum3() {
        int[] nums = {1, 2, 3};

        assertEquals(6, new Sum3().sum3(nums));
    }
}