package string2.endother;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EndOtherTest {

    @Test
    void test() {
        String input1 = "HiAbC";
        String input2 = "aBc";

        assertTrue(new EndOther().endOther(input1, input2));
    }


    @Test
    void test2() {
        String input1 = "xyz";
        String input2 = "12xyz";

        assertTrue(new EndOther().endOther(input1, input2));
    }
}