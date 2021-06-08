package array2.more14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class More14Test {

    @Test
    void testTrue() {
        int[] input = {1, 4, 1};

        More14 more14 = new More14();

        assertTrue(more14.more14(input));
    }

    @Test
    void testFalse() {
        int[] input = {1, 4, 1, 4};

        More14 more14 = new More14();

        assertFalse(more14.more14(input));
    }

}