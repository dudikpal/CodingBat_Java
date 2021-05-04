package functional1.square;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void square() {
        List<Integer> input = new ArrayList<>(List.of(6,8,-6, -8, 1));
        List<Integer> expected = List.of(36, 64, 36, 64, 1);
        assertEquals(expected, new Square().square(input));
    }
}