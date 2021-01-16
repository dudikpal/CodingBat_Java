package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloNameTest {

    @Test
    void helloName() {
        String name = "Bob";

        assertEquals("Hello Bob!", new HelloName().helloName(name));
    }
}