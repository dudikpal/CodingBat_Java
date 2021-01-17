package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeenSumTest {

    @Test
    void teenSum() {
        int a = 13;
        int b = 21;

        assertEquals(19, new TeenSum().teenSum(a, b));
    }
}