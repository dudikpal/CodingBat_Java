package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrCountTest {
    
    @Test
    void strCountOne() {
        
        assertEquals(1, new StrCount().strCount("aaabababab", "aa"));
        
    }
    
    
    @Test
    void strCountTwo() {
        
        assertEquals(2, new StrCount().strCount("catcowcat", "cat"));
        
    }
}