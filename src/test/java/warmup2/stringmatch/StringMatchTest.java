package warmup2.stringmatch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringMatchTest {
    
    @Test
    void stringMatchWithoutOverlap() {
        
        assertEquals(3, new StringMatch().stringMatch("xxcaazz", "xxbaaz"));
        
    }
    
    
    @Test
    void stringMatchWithOverlap() {
        
        assertEquals(3, new StringMatch().stringMatch("iaxxai", "aaxxaaxx"));
        
    }
}