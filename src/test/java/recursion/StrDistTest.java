package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrDistTest {
    
    @Test
    void strDistLengthNine() {
        
        assertEquals(9, new StrDist().strDist("cccatcowcatxx", "cat"));
        
    }
    
    
    @Test
    void strDistLengthOne() {
        
        assertEquals(1, new StrDist().strDist("c", "c"));
        
    }
    
    
    @Test
    void strDistLengthTwelve() {
        
        assertEquals(12, new StrDist().strDist("abccatcowcatcatxyz", "cat"));
        
    }
}