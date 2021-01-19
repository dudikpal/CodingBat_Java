package array1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MakeLastTest {

    @Test
    void makeLast() {
        int[] nums = {1, 2, 3};

        assertEquals("[0, 0, 0, 0, 0, 3]", Arrays.toString(new MakeLast().makeLast(nums)));
    }
}