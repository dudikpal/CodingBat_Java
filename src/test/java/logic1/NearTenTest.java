package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NearTenTest {

    @Test
    void nearTen() {
        int num = 18;

        assertTrue(new NearTen().nearTen(num));
    }
}