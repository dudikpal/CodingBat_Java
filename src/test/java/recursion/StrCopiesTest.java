package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrCopiesTest {
    
    @Test
    void strCopiesTrue() {
        
        assertTrue(new StrCopies().strCopies("ijiiiiij", "iiii", 2));
        
    }
    
    
    @Test
    void strCopiesFalse() {
        
        assertFalse(new StrCopies().strCopies("iiiiij", "iii", 4));
        
    }
}