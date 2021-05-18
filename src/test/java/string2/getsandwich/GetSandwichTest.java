package string2.getsandwich;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetSandwichTest {

    @Test
    void test() {
        String input = "xxbreadjambreadyy";
        String expected = "jam";
        assertEquals(expected, new GetSandwich().getSandwich(input));
    }

}