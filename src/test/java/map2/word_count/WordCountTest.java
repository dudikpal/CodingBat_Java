package map2.word_count;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class WordCountTest {

    @ParameterizedTest
    @MethodSource("params")
    void test(String[] input, Map<String, Integer> expected) {
        assertEquals(expected, new WordCount().wordCount(input));
    }

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.arguments(new String[]{"a", "b", "a", "c", "b"}, Map.of("a", 2, "b", 2, "c", 1)),
                Arguments.arguments(new String[]{"c", "b", "a"}, Map.of("a", 1, "b", 1, "c", 1)),
                Arguments.arguments(new String[]{"c", "c", "c", "c"}, Map.of("c", 4))
        );
    }

}