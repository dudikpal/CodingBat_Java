package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerNTest {
    
    @Test
    void powerN() {
        
        assertEquals(625, new PowerN().powerN(5, 4));
        
    }
}