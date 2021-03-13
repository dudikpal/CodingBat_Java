package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Count8Test {
    
    @Test
    void count8TestSimpleEight() {
        
        assertEquals(1, new Count8().count8(8));
        
    }
    
    @Test
    void count8TestTwoSimpleEight() {
        
        assertEquals(2, new Count8().count8(818));
        
    }
    
    @Test
    void count8TestOneDoubleEight() {
        
        assertEquals(4, new Count8().count8(8818));
        
    }
    
    @Test
    void count8TestMultipleEights() {
        
        assertEquals(5, new Count8().count8(1818188));
        
    }
    
    @Test
    void count8TestAllEights() {
        
        assertEquals(9, new Count8().count8(88888));
        
    }
}