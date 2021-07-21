package functional2.no34;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class No34Test {

    @ParameterizedTest
    @MethodSource("params")
    void no34(List<String> input, List<String> expected) {

        assertEquals(expected, new No34().no34(input));
    }

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.arguments(List.of("a", "bb", "ccc"), List.of("a", "bb")),
                Arguments.arguments(List.of("a", "bb", "ccc", "dddd"), List.of("a", "bb")),
                Arguments.arguments(List.of("ccc", "dddd", "apple"), List.of("apple"))
        );
    }
}