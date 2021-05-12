package string2.bobthere;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BobThereTest {

    @Test
    void test() {
        String input = "ab9b";
        assertTrue(new BobThere().bobThere(input));
    }

}