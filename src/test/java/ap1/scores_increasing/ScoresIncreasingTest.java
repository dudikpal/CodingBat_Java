package ap1.scores_increasing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ScoresIncreasingTest {

    @ParameterizedTest
    @MethodSource("params")
    void test(int[] input, boolean expected) {
        assertEquals(expected, new ScoresIncreasing().scoresIncreasing(input));
    }

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.arguments(new int[] {1, 3, 4}, true),
                Arguments.arguments(new int[] {1, 3, 2}, false),
                Arguments.arguments(new int[] {1, 1, 4}, true)
        );
    }

}