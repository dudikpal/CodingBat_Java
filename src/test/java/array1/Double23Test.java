package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Double23Test {

    @Test
    void double23() {
        int[] nums = {2, 3};

        assertFalse(new Double23().double23(nums));
    }
}