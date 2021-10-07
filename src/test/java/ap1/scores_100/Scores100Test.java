package ap1.scores_100;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Scores100Test {

    @ParameterizedTest
    @MethodSource("params")
    void test(int[] input, boolean expected) {
        assertEquals(expected, new Scores100().scores100(input));
    }

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.arguments(new int[]{1, 100, 100}, true),
                Arguments.arguments(new int[]{1, 100, 99, 100}, false),
                Arguments.arguments(new int[]{100, 1, 100, 100}, true)
        );
    }

}