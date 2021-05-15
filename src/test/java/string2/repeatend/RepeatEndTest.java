package string2.repeatend;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatEndTest {

    @Test
    void test(){
        String input = "Hello";
        int inputInt = 3;
        String expected = "llollollo";
        assertEquals(expected, new RepeatEnd().solution(input, inputInt));
    }

}