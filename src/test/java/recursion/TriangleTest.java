package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    
    @Test
    void triangle() {
        
        assertEquals(10, new Triangle().triangle(4));
        
    }
}