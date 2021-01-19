package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Has23Test {

    @Test
    void has23() {
        int[] nums = {4, 2};

        assertTrue(new Has23().has23(nums));
    }
}