package array1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Make2Test {

    @Test
    void make2() {
        int[] a = {3};
        int[] b = { 1, 2};

        assertEquals("[3, 1]", Arrays.toString(new Make2().make2(a, b)));
    }
}