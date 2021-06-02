package array2.notalone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotAloneTest {

    @Test
    void test() {
        int[] inputArr = {1, 2, 3};
        int inputNumber = 2;
        int[] expected = {1, 3, 3};
        assertArrayEquals(expected, new NotAlone().notAlone(inputArr, inputNumber));
    }

    @Test
    void test2() {
        int[] inputArr = {1, 2, 3, 2, 5, 2};
        int inputNumber = 2;
        int[] expected = {1, 3, 3, 5, 5, 2};
        assertArrayEquals(expected, new NotAlone().notAlone(inputArr, inputNumber));
    }

}