package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialElevenTest {

    @Test
    void specialEleven() {
        int n = 23;

        assertTrue(new SpecialEleven().specialEleven(n));
    }
}