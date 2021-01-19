package array1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PlusTwoTest {

    @Test
    void plusTwo() {
        int[] a = {1, 2};
        int[] b = {3, 4};

        assertEquals("[1, 2, 3, 4]", Arrays.toString(new PlusTwo().plusTwo(a, b)));
    }
}