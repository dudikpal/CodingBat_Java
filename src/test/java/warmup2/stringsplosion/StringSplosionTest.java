package warmup2.stringsplosion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringSplosionTest {
    
    @Test
    void stringSplosion() {
        
        assertEquals("CCoCodCode", new StringSplosion().stringSplosion("Code"));
        
    }
}