package functional2.no9;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class No9Test {

    @ParameterizedTest
    @MethodSource("params")
    void no9(List<Integer> input, List<Integer> expected) {
        assertTrue(expected.equals(new No9().no9(input)));
    }

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.arguments(List.of(1, 2, 19), List.of(1, 2)),
                Arguments.arguments(List.of(9, 19, 29, 3), List.of(3)),
                Arguments.arguments(List.of(1, 2, 3), List.of(1, 2, 3))
        );
    }
}