package map1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapBullyTest {

    @Test
    void mapBully() {
        Map<String, String> map = new HashMap<>(){{
            put("a", "candy");
            put("b", "short");
        }};

        assertEquals("{a=, b=candy}", new MapBully().mapBully(map).toString());
    }
}