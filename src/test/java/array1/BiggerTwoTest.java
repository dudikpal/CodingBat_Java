package array1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BiggerTwoTest {

    @Test
    void biggerTwo() {
        int[] a = {1, 2};
        int[] b = {1, 3};

        assertEquals("[1, 3]", Arrays.toString(new BiggerTwo().biggerTwo(a, b)));
    }
}