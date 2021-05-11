package functional1.nox;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NoXTest {

    @Test
    void noX() {
        List<String> input = new ArrayList<>(List.of("xxax", "cx", "x"));
        List<String> expected = List.of("a", "c", "");
        assertEquals(expected, new NoX().noX(input));
    }
}