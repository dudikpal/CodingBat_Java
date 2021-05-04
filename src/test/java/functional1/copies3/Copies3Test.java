package functional1.copies3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Copies3Test {

    @Test
    void copies3() {
        List<String> input = new ArrayList<>(List.of("24", "a", ""));
        List<String> expected = List.of("242424", "aaa", "");
        assertEquals(expected, new Copies3().copies3(input));
    }
}