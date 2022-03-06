package string3.countTriple;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CountTripleTest {

    @ParameterizedTest
    @MethodSource("params")
    void test(String input, int expected) {

        assertEquals(expected, new CountTriple().countTriple(input));
    }

    static Stream<Arguments> params() {

        return Stream.of(
                Arguments.arguments("abcXXXabc", 1),
                Arguments.arguments("xxxabyyyycd", 3),
                Arguments.arguments("a", 0)
        );
    }

}