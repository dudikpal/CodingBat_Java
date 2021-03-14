package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParenBitTest {
    
    @Test
    void parenBit() {
        
        assertEquals("(abc)", new ParenBit().parenBit("xyz(abc)123"));
        
    }
}