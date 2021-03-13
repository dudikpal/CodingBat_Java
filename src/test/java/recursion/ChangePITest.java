package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChangePITest {
    
    @Test
    void changePi() {
        
        assertEquals("x3.14x", new ChangePI().changePi("xpix"));
        
    }
}