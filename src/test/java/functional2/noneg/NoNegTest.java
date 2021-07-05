package functional2.noneg;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class NoNegTest {

    @ParameterizedTest
    @MethodSource("params")
    void noNeg(List<Integer> input, List<Integer> expected) {
        assertTrue(expected.equals(new NoNeg().noNeg(input)));
    }

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.arguments(List.of(1, -2), List.of(1)),
                Arguments.arguments(List.of(-3, -3, 3, 3), List.of(3, 3)),
                Arguments.arguments(List.of(-1, -1, -1), List.of())
        );
    }
}