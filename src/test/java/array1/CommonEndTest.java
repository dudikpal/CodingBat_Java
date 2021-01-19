package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonEndTest {

    @Test
    void commonEnd() {
        int[] a = {1, 2, 3};
        int[] b = {1, 3, 6};

        assertTrue(new CommonEnd().commonEnd(a, b));
    }
}