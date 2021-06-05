package array2.centeredaverage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CenteredAverageTest {

    @Test
    void test() {
        int[] input = {1, 2, 3, 4, 100};
        int expected = 3;
        assertEquals(expected, new CenteredAverage().centeredAverage(input));
    }

}