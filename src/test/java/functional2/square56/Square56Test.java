package functional2.square56;

import com.sun.source.doctree.SeeTree;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Square56Test {

    @ParameterizedTest
    @MethodSource("params")
    void square56(List<Integer> input, List<Integer> expected) {
        assertTrue(expected.equals(new Square56().square56(input)));
    }

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.arguments(List.of(3, 1, 4), List.of(19, 11)),
                Arguments.arguments(List.of(1), List.of(11)),
                Arguments.arguments(List.of(2), List.of(14))
        );
    }
}