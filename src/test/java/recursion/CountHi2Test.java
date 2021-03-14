package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountHi2Test {
    
    @Test
    void countHi2HitZero() {
        
        assertEquals(0, new CountHi2().countHi2("xhixhi"));
        
    }
    
    
    @Test
    void countHi2HitZeroWithOnlyX() {
        
        assertEquals(0, new CountHi2().countHi2("xxxx"));
        
    }
    
    
    @Test
    void countHi2HitTwo() {
        
        assertEquals(2, new CountHi2().countHi2("ahibhi"));
        
    }
    
    
    @Test
    void countHi2HitThree() {
        
        assertEquals(3, new CountHi2().countHi2("hihihix"));
        
    }
}