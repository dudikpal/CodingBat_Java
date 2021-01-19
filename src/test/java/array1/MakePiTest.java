package array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakePiTest {

    @Test
    void makePi() {
        int[] pi = {3, 1, 4};

        assertEquals(1, new MakePi().makePi()[1]);
    }
}