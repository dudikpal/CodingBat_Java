package map1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapAB4Test {
    
    @Test
    void mapAB4() {
    
        Map<String, String> map = new HashMap<>(){{
            put("a", "aaa");
            put("b", "bbbb");
        }};
    
        Map<String, String> expected = new HashMap<>(){{
            put("a", "aaa");
            put("b", "bbbb");
            put("c", "bbbb");
        }};
    
        assertEquals(expected, new MapAB4().mapAB4(map));
        
    }
}