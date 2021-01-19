package array1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Reverse3Test {

    @Test
    void reverse3() {
        int[] nums = {1, 2, 3};

        assertEquals("[3, 2, 1]", Arrays.toString(new Reverse3().reverse3(nums)));
    }
}