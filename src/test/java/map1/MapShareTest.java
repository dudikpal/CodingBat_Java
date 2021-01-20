package map1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapShareTest {

    @Test
    void mapShare() {
        Map<String, String> map = new HashMap<>(){{
            put("a", "aaa");
            put("b", "bbb");
            put("c", "ccc");
        }};

        assertEquals("{a=aaa, b=aaa}", new MapShare().mapShare(map).toString());
    }
}