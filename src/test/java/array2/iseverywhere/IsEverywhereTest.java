package array2.iseverywhere;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsEverywhereTest {

    @Test
    void test() {
        int[] inputArr = {1, 2, 1, 3};
        int inputValue = 1;
        assertTrue(new IsEverywhere().isEverywhere(inputArr, inputValue));
    }

    @Test
    void test2() {
        int[] inputArr = {1, 2, 1, 3};
        int inputValue = 2;
        assertFalse(new IsEverywhere().isEverywhere(inputArr, inputValue));
    }

}