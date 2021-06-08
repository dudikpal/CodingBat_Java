package array2.has12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Has12Test {

    @Test
    void test() {
        int[] input = {3, 1, 4, 5, 2};

        assertTrue(new Has12().has12(input));
    }


}