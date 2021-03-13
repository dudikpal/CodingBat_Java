package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array6Test {
    
    @Test
    void array6ContainSixFromIndexZero() {
        
        assertTrue(new Array6().array6(new int[]{1, 6, 4}, 0));
        
    }
    
    @Test
    void array6NotContainSixFromIndexThree() {
        
        assertFalse(new Array6().array6(new int[]{1, 6, 4, 8, 2}, 3));
        
    }
}