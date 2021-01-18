package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzString2Test {

    @Test
    void fizzString2() {
        int n = 15;

        assertEquals("FizzBuzz!", new FizzString2().fizzString2(n));
    }
}