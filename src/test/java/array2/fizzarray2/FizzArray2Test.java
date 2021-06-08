package array2.fizzarray2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzArray2Test {

    @Test
    void test() {
        int input = 10;

        FizzArray2 fizzArray2 = new FizzArray2();
        String[] expected = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        assertArrayEquals(expected, fizzArray2.fizzArray2(input));
    }

}