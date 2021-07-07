package functional2.noteen;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NoTeenTest {

    @ParameterizedTest
    @MethodSource("params")
    void noTeen(List<Integer> input, List<Integer> expected) {
        assertTrue(expected.equals(new NoTeen().noTeen(input)));
    }

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.arguments(List.of(12, 13, 19, 20), List.of(12, 20)),
                Arguments.arguments(List.of(1, 14, 1), List.of(1, 1)),
                Arguments.arguments(List.of(15), List.of())
        );
    }
}