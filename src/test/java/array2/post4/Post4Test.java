package array2.post4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Post4Test {

    @Test
    void test() {
        int[] input = {2, 4, 1, 2};
        int[] expected = {1, 2};
        assertArrayEquals(expected, new Post4().post4(input));
    }

    @Test
    void test2() {
        int[] input = {4, 4, 1, 2, 3};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, new Post4().post4(input));
    }

}