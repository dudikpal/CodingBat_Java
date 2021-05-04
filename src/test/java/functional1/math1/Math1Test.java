package functional1.math1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Math1Test {

    @Test
    void math1() {
        List<Integer> input = new ArrayList<>(List.of(1, 2, 3, 6, 8));
        List<Integer> expected = List.of(20, 30, 40, 70, 90);
        assertEquals(expected, new Math1().math1(input));
    }
}