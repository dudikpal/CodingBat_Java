package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumDigitsTest {
    
    @Test
    void sumDigits() {
        
        assertEquals(9, new SumDigits().sumDigits(126));
        
    }
}