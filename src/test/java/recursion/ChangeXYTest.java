package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChangeXYTest {
    
    @Test
    void changeXY1() {
    
        assertEquals("yhiyhiy", new ChangeXY().changeXY("xhixhix"));
    
    }
    
    @Test
    void changeXY2() {
        
        assertEquals("yyhyyi", new ChangeXY().changeXY("yyhxyi"));
        
    }
}