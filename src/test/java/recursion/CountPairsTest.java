package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountPairsTest {
    
    @Test
    void countPairsOnePairs() {
        
        assertEquals(1, new CountPairs().countPairs("axbx"));
        
    }
    
    
    @Test
    void countPairsTwoPairs() {
        
        assertEquals(2, new CountPairs().countPairs("axax"));
        
    }
    
    
    @Test
    void countPairsThreePairs() {
        
        assertEquals(3, new CountPairs().countPairs("axaxa"));
        
    }
    
}