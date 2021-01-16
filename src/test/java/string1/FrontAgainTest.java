package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrontAgainTest {

    @Test
    void frontAgain() {
        String str = "edited";

        assertTrue(new FrontAgain().frontAgain(str));
    }
}