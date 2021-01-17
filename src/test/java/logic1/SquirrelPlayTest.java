package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquirrelPlayTest {

    @Test
    void squirrelPlay() {
        int temp = 99;
        boolean isSummer = true;

        assertTrue(new SquirrelPlay().squirrelPlay(temp, isSummer));
    }
}