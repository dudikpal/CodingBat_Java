package array2.sameends;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SameEndsTest {

    @Test
    void test() {
        int[] inputArr = {5, 6, 45, 99, 13, 5, 6};
        int inputN = 2;
        assertTrue(new SameEnds().sameEnds(inputArr, inputN));
    }

}