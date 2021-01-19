package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateLeft3Test {

    @Test
    void rotateLeft3() {
        int[] nums = {1, 2, 3};

        assertEquals(2, new RotateLeft3().rotateLeft3(nums)[0]);
    }
}