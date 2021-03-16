package warmup2.doublex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleXTest {
    
    @Test
    void doubleXTrue() {
        
        assertTrue(new DoubleX().doubleX("axxbbcc"));
        
    }
    
    
    @Test
    void doubleXFalse() {
        
        assertFalse(new DoubleX().doubleX("axbxcxxd"));
        
    }
}