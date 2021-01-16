package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeAbbaTest {

    @Test
    void makeAbba() {
        String a = "Hi";
        String b = "Bye";

        assertEquals("HiByeByeHi", new MakeAbba().makeAbba(a, b));
    }
}