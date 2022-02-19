package string3.same_ends;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SameEndsTest {


    @ParameterizedTest
    @MethodSource("params")
    void test(String input, String expected) {

        assertEquals(expected, new SameEnds().sameEnds(input));
    }

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.arguments("abXYab", "ab"),
                Arguments.arguments("xx", "x"),
                Arguments.arguments("xxx", "x")
        );
    }

}