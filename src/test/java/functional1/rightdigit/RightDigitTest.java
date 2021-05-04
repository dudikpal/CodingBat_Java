package functional1.rightdigit;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RightDigitTest {

    @Test
    void rightDigit() {
        List<Integer> input = new ArrayList<>(List.of(16, 8, 112, 0));
        List<Integer> expected = List.of(6, 8, 2, 0);
        assertEquals(expected, new RightDigit().rightDigit(input));
    }
}