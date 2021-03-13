package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountABCTest {
    
    @Test
    void countAbc() {
        
        assertEquals(2, new CountABC().countAbc("abcxxaba"));
        
    }
}