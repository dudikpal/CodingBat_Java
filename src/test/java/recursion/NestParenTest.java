package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NestParenTest {
    
    @Test
    void nestParenThreePair() {
        
        assertTrue(new NestParen().nestParen("((()))"));
        
    }
    
    
    @Test
    void nestParenZeroParenthesis() {
        
        assertTrue(new NestParen().nestParen(""));
        
    }
    
    
    @Test
    void nestParenUnPair() {
        
        assertFalse(new NestParen().nestParen("((x)))"));
        
    }
}