package functional2.nolong;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.sql.ClientInfoStatus;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NoLongTest {

    @ParameterizedTest
    @MethodSource("params")
    void noLong(List<String> input, List<String> expected) {
        assertTrue(expected.equals(new NoLong().noLong(input)));
    }

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.arguments(List.of("this", "not", "too", "long"), List.of("not", "too")),
                Arguments.arguments(List.of("a", "bbb", "cccc"), List.of("a", "bbb")),
                Arguments.arguments(List.of("cccc", "cccc", "cccc"), List.of())
        );
    }

}