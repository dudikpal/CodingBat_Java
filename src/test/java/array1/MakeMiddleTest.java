package array1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MakeMiddleTest {

    @Test
    void makeMiddle() {
        int[] nums = {1, 2, 3, 4};

        assertEquals("[2, 3]", Arrays.toString(new MakeMiddle().makeMiddle(nums)));
    }
}