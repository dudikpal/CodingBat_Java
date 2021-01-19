package array1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MidThreeTest {

    @Test
    void midThree() {
        int[] nums = {1, 2, 3, 4, 5};

        assertEquals("[2, 3, 4]", Arrays.toString(new MidThree().midThree(nums)));
    }
}