package functional1.addstar;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddStarTest {

    @Test
    void addStar() {
        List<String> input = new ArrayList<>(List.of("a", "bbb"));
        List<String> expected = List.of("a*", "bbb*");
        assertEquals(expected, new AddStar().addStar(input));
    }
}