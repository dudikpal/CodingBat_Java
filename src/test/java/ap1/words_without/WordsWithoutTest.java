package ap1.words_without;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class WordsWithoutTest {

    @ParameterizedTest
    @MethodSource("params")
    void test(String[] input, String exclude, String[] expected) {
        assertArrayEquals(expected, new WordsWithout().wordsWithout(input, exclude));
    }

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.arguments(new String[]{"a", "b", "c", "a"}, "a", new String[]{"b", "c"}),
                Arguments.arguments(new String[]{"a", "b", "c", "a"}, "b", new String[]{"a", "c", "a"}),
                Arguments.arguments(new String[]{"a", "b", "c", "a"}, "c", new String[]{"a", "b", "a"})
        );
    }

}