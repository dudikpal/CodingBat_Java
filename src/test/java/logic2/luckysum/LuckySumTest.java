package logic2.luckysum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LuckySumTest {

    @ParameterizedTest(name = "int[]({0}, {1}, {2}) -> {3}")
    @MethodSource("luckySumInputs")
    void test(int a, int b, int c, int expected) {
        assertEquals(expected, new LuckySum().luckySum(a, b, c));
    }

    private static Stream<Arguments> luckySumInputs() {
        return Stream.of(
            Arguments.arguments(1, 2, 3, 6),
            Arguments.arguments(1, 2, 13, 3),
            Arguments.arguments(1, 13, 3, 1),
            Arguments.arguments(1, 13, 13, 1)
        );
    }

}