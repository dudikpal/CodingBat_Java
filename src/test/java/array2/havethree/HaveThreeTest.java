package array2.havethree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HaveThreeTest {

    @Test
    void test() {
        int[] input = {3, 1, 3, 1, 3};
        assertTrue(new HaveThree().haveThree(input));
    }

    @Test
    void test2() {
        int[] input = {3, 1, 3, 3};
        assertFalse(new HaveThree().haveThree(input));
    }

}