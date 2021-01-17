package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Less20Test {

    @Test
    void less20() {
        int n = 18;

        assertTrue(new Less20().less20(n));
    }
}