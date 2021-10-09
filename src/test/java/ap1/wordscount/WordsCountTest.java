package ap1.wordscount;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class WordsCountTest {

    @ParameterizedTest
    @MethodSource("params")
    void test(String[] input, int length, int expected) {
        assertEquals(expected, new WordsCount().wordsCount(input, length));
    }


    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.arguments(new String[]{"a", "bb", "b", "ccc"}, 1, 2),
                Arguments.arguments(new String[]{"a", "bb", "b", "ccc"}, 3, 1),
                Arguments.arguments(new String[]{"a", "bb", "b", "ccc"}, 4, 0)
        );
    }
}