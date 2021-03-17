package warmup2.stringyak;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringYakTest {
    
    @Test
    void stringYak1() {
        
        assertEquals("123ya", new StringYak().stringYak("yak123ya"));
        
    }
    
    
    @Test
    void stringYak2() {
        
        assertEquals("xxxyyzzz", new StringYak().stringYak("xxxyakyyyakzzz"));
        
    }
    
}