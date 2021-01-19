package array1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MiddleWayTest {

    @Test
    void middleWay() {
        int[] a = {1, 2, 3};
        int[] b = {2, 3, 4};

        assertEquals("[2, 3]", Arrays.toString(new MiddleWay().middleWay(a, b)));
    }
}