package functional2.two2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Two2Test {

    @ParameterizedTest
    @MethodSource("params")
    void two2(List<Integer> input, List<Integer> expected) {
        assertTrue(expected.equals(new Two2().two2(input)));
    }

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.arguments(List.of(1, 2, 3), List.of(4, 6)),
                Arguments.arguments(List.of(2, 6, 11), List.of(4)),
                Arguments.arguments(List.of(0), List.of(0))
        ) ;
    }
}