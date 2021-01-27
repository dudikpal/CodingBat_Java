package map1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapABTest {
  
  @Test
  void mapAB() {
    Map<String, String> map = new HashMap<>(){{
      put("a", "Hi");
      put("b", " there");
    }};
    
    assertEquals("{a=Hi, ab=Hi there, b= there}", new MapAB().mapAB(map).toString());
  }
}