package logic2.makebricks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeBricksTest {

    @Test
    void testTrue() {
        int small = 3;
        int big = 1;
        int goal = 8;
        assertTrue(new MakeBricks().makeBricks(small, big, goal));
    }

    @Test
    void testFalse() {
        int small = 3;
        int big = 1;
        int goal = 9;
        assertFalse(new MakeBricks().makeBricks(small, big, goal));
    }

    @Test
    void testFalse2() {
        int small = 1;
        int big = 4;
        int goal = 12;
        assertFalse(new MakeBricks().makeBricks(small, big, goal));
    }

}