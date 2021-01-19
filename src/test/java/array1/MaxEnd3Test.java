package array1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MaxEnd3Test {

    @Test
    void maxEnd3() {
        int[] nums = {1, 2, 3};

        assertEquals("[3, 3, 3]", Arrays.toString(new MaxEnd3().maxEnd3(nums)));
    }
}