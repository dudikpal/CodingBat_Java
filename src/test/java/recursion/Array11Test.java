package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array11Test {
    
    @Test
    void array11ContainEleven() {
        
        assertEquals(2, new Array11().array11(new int[]{11, 3, 6, 11, 2}, 0));
        
    }
    
    
    @Test
    void array11NotContainEleven() {
        
        assertEquals(0, new Array11().array11(new int[]{11, 3, 6, 7, 2}, 2));
        
    }
}