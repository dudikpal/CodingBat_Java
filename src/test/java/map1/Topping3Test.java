package map1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Topping3Test {
    
    @Test
    void topping3() {
        
        Topping3 topping3Instance = new Topping3();
        
        Map<String, String> map = new HashMap<>(){{
            put("spinach", "oil");
            put("salad", "oil");
            put("potato", "ketchup");
            put("fries", "ketchup");
        }};
        
        
        
        assertEquals(map, topping3Instance.topping3(map));
    }
}