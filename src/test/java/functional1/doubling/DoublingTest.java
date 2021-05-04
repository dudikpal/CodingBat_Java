package functional1.doubling;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DoublingTest {

    @Test
    void doubling() {

        List<Integer> input = List.of(6, 8, 6, 8, -1);
        List<Integer> expected = List.of(12, 16, 12, 16, -2);

        assertEquals(expected, new Doubling().doubling(input));
    }
}