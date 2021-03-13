package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array220Test {
    
    @Test
    void array220True() {
        
        assertTrue(new Array220().array220(new int[]{1, 3, 30}, 0));
        
    }
    
    
    @Test
    void array220False() {
        
        assertFalse(new Array220().array220(new int[]{1, 3, 30, 45, 2}, 2));
        
    }
}