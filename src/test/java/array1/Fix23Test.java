package array1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Fix23Test {

    @Test
    void fix23() {
        int[] nums = {1, 2, 3};

        assertEquals("[1, 2, 0]", Arrays.toString(new Fix23().fix23(nums)));
    }
}