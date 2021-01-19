package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SameFirstLastTest {

    @Test
    void sameFirstLast() {
        int[] nums = {};

        assertFalse(new SameFirstLast().sameFirstLast(nums));
    }
}