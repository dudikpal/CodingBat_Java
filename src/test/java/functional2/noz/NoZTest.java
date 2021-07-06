package functional2.noz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NoZTest {

    @ParameterizedTest
    @MethodSource("params")
    void noZ(List<String> input, List<String> expected) {

        assertTrue(expected.equals(new NoZ().noZ(input)));
    }

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.arguments(List.of("aaa", "bbb", "aza"), List.of("aaa", "bbb")),
                Arguments.arguments(List.of("hziz", "hzello", "hi"), List.of("hi")),
                Arguments.arguments(List.of("hello", "howz", "are", "youz"), List.of("hello", "are"))
        );
    }
}