package recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BunnyEarsTest {
    
    @Test
    void bunnyEars() {
        
        assertEquals(16, new BunnyEars().bunnyEars(8));
        
    }
}