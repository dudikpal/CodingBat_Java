package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    
    @Test
    void factorial() {
        assertEquals(24, new Factorial().factorial(4));
    }
}