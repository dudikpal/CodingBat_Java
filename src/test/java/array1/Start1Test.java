package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Start1Test {

    @Test
    void start1() {
        int[] a = {1, 2, 3};
        int[] b = {3, 2, 1};

        assertEquals(1, new Start1().start1(a, b));
    }
}