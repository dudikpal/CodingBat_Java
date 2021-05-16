package string2.starout;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StarOutTest {

    @Test
    void test() {
        String input = "sm***eil*ly";
        String expected = "siy";
        assertEquals(expected, new StarOut().starOut(input));
    }

}