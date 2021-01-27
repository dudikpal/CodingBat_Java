package map1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Topping1Test {
  
  @Test
  void topping1() {
    Map<String, String> map = new HashMap<>(){{
      put("ice cream", "peanuts");
    }};
    
    assertEquals("{bread=butter, ice cream=cherry}", new Topping1().topping1(map).toString());
  }
}