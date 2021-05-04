package functional1.lower;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LowerTest {

    @Test
    void lower() {
        List<String> input = new ArrayList<>(List.of("Hello", "AbBa"));
        List<String> expected = List.of("hello", "abba");
        assertEquals(expected, new Lower().lower(input));
    }
}