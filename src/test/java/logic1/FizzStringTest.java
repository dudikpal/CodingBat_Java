package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzStringTest {

    @Test
    void fizzString() {
        String str = "fab";

        assertEquals("FizzBuzz", new FizzString().fizzString(str));
    }
}