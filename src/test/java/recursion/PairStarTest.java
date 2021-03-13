package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairStarTest {
    
    @Test
    void pairStarOneAdjacent() {
        
        assertEquals("hel*lo", new PairStar().pairStar("hello"));
        
    }
    
    
    @Test
    void pairStarFourAdjacent() {
        
        assertEquals("a*a*a*a", new PairStar().pairStar("aaaa"));
        
    }
}