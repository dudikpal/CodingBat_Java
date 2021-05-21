package array2.lucky13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lucky13Test {

    @Test
    void test() {
        int[] input = {1, 2, 3};
        assertFalse(new Lucky13().lucky13(input));
    }

}