package array2.matchup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchUpTest {

    @Test
    void test() {
        int[] input1 = {1, 2, 3};
        int[] input2 = {2, 3, 10};
        int expected = 2;
        assertEquals(expected, new MatchUp().matchUp(input1, input2));
    }

}