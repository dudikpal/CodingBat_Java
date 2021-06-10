package array2.fizzarray3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzArray3Test {

    @Test
    void test() {
        int inputStart = 5;
        int inputEnd = 10;
        int[] expected = {5, 6, 7, 8, 9};
        assertArrayEquals(expected, new FizzArray3().fizzArray3(inputStart, inputEnd));
    }

}