package functional2.noyy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NoYYTest {

    @ParameterizedTest
    @MethodSource("params")
    void noYY(List<String> input, List<String> expected) {
        assertTrue(expected.equals(new NoYY().noYY(input)));

    }

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.arguments(List.of("a", "b", "c"), List.of("ay", "by", "cy")),
                Arguments.arguments(List.of("a", "b", "cy"), List.of("ay", "by")),
                Arguments.arguments(List.of("xx", "ya", "zz"), List.of("xxy", "yay", "zzy"))
        );
    }
}