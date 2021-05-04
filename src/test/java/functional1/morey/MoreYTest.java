package functional1.morey;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MoreYTest {

    @Test
    void moreY() {
        List<String> input = new ArrayList<>(List.of("a", "yay", "hello"));
        List<String> expected = List.of("yay", "yyayy", "yhelloy");
        assertEquals(expected, new MoreY().moreY(input));
    }
}