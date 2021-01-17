package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaughtSpeedingTest {

    @Test
    void caughtSpeeding() {
        int speed = 83;
        boolean isBirthday = true;

        assertEquals(1, new CaughtSpeeding().caughtSpeeding(speed, isBirthday));
    }
}