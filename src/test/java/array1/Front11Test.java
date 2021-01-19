package array1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Front11Test {

    @Test
    void front11() {
        int[] a = {};
        int[] b = {3, 4};

        assertEquals("[3]", Arrays.toString(new Front11().front11(a, b)));
    }
}