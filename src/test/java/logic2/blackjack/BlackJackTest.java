package logic2.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlackJackTest {

    @Test
    void test() {
        int a = 19;
        int b = 22;
        int expected = 19;
        assertEquals(expected, new BlackJack().blackjack(a, b));
    }

}