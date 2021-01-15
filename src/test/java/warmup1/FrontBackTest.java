package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrontBackTest {

    @Test
    void frontBack() {

        FrontBack fb = new FrontBack();

        String str = "Test string";

        assertEquals("gest strinT", fb.frontBack(str));
    }
}