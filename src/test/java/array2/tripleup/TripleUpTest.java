package array2.tripleup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripleUpTest {

    @Test
    void test() {
        int[] input = {1, 4, 5, 6, 2};
        assertTrue(new TripleUp().tripleUp(input));
    }

    @Test
    void test2() {
        int[] input = {1, 2, 4};
        assertFalse(new TripleUp().tripleUp(input));
    }

}