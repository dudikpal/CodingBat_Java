package array2.sum28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sum28Test {

    @Test
    void test() {
        int[] input = {2, 3, 2, 2, 4, 2};
        assertTrue(new Sum28().sum28(input));
    }

    @Test
    void test2() {
        int[] input = {2, 3, 2, 2, 4, 2, 2};
        assertFalse(new Sum28().sum28(input));
    }

}