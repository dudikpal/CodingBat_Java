package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Unlucky1Test {

    @Test
    void unlucky1() {
        int[] nums = {2, 1, 3, 4, 5};

        assertTrue(new Unlucky1().unlucky1(nums));
    }
}