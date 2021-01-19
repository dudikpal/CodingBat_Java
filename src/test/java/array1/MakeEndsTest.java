package array1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MakeEndsTest {

    @Test
    void makeEnds() {
        int[] nums = {1, 3, 2, 5, 8};

        assertEquals("[1, 8]", Arrays.toString(new MakeEnds().makeEnds(nums)));
    }
}