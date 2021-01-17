package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Love6Test {

    @Test
    void testCreate() {
        int a = 3;
        int b = 9;

        assertTrue(new Love6().love6(a, b));
    }

}