package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NearTeenTest {

    @Test
    void nearTen() {
        int num = 18;

        assertTrue(new NearTeen().nearTen(num));
    }
}