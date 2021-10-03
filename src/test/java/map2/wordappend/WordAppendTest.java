package map2.wordappend;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class WordAppendTest {

    @ParameterizedTest
    @MethodSource("params")
    void test(String[] input, String expected) {
        assertEquals(expected, new WordAppend().wordAppend(input));
    }

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.arguments(new String[] {"a", "b", "a"}, "a"),
                Arguments.arguments(new String[] {"a", "b", "a", "c", "a", "d", "a"}, "aa"),
                Arguments.arguments(new String[] {"a", "", "a"}, "a"),
                Arguments.arguments(new String[] {"a", ""}, "")
        );
    }

}