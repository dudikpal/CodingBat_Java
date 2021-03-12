package map1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapAB3Test {
    
    @Test
    void mapAB3() {
    
        Map<String, String> map = new HashMap<>(){{
            put("a", "aaa");
            put("c", "cake");
        }};
        
        Map<String, String> expected = new HashMap<>(){{
            put("a", "aaa");
            put("b", "aaa");
            put("c", "cake");
        }};
        
        assertEquals(expected, new MapAB3().mapAB3(map));
    }
}