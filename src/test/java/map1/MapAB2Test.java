package map1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapAB2Test {
    
    @Test
    void mapAB2() {
        Map<String, String> map = new HashMap<>(){{
           put("a", "aaa");
           put("b", "aaa");
           put("c", "cake");
        }};
        
        Map<String, String> expected = new HashMap<>(){{
            put("c", "cake");
        }};
        
        assertEquals(expected, new MapAB2().mapAB2(map));
    }
}