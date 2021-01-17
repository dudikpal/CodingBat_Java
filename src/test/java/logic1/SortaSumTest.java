package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortaSumTest {

    @Test
    void sortaSum() {
        int a = 11;
        int b = 3;

        assertEquals(20, new SortaSum().sortaSum(a, b));
    }
}