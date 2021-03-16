package warmup2.stringbits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringBitsTest {
    
    @Test
    void stringBits() {
        
        assertEquals("happy", new StringBits().stringBits("hxaxpxpxy"));
        
    }
}