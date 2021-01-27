package map1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Topping2Test {
  
  @Test
  void topping2() {
    Map<String, String> map = new HashMap<>(){{
      put("spinach", "tasty");
      put("ice cream", "air");
    }};
    
    assertEquals("{yogurt=air, spinach=nuts, ice cream=air}", new Topping2().topping2(map).toString());
  }
}