package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCleanTest {
    
    @Test
    void stringClean() {
        
        assertEquals("abcd", new StringClean().stringClean("aabbbcdddd"));
        
    }
}