package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstLast6Test {

    @Test
    void firstLast6() {
        int[] nums = {1, 2, 3, 4, 5, 6};

        assertTrue(new FirstLast6().firstLast6(nums));
    }
}