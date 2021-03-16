package warmup2.stringx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringXTest {
    
    @Test
    void stringXMiddle() {
        
        assertEquals("abcd", new StringX().stringX("abxxxcd"));
        
    }
    
    
    @Test
    void stringXStartMiddleEnd() {
        
        assertEquals("xabcdx", new StringX().stringX("xabxxxcdx"));
        
    }
}