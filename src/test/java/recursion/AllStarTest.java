package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AllStarTest {
    
    @Test
    void allStar() {
        
        assertEquals("h*e*l*l*o", new AllStar().allStar("hello"));
        
    }
}