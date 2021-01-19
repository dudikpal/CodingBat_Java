package array1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SwapEndsTest {

    @Test
    void swapEnds() {
        int[] nums = {1, 2, 3, 4, 5};

        assertEquals("[5, 2, 3, 4, 1]", Arrays.toString(new SwapEnds().swapEnds(nums)));
    }
}