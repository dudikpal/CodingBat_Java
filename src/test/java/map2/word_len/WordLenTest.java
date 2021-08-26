package map2.word_len;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class WordLenTest {

    @ParameterizedTest
    @MethodSource("params")
    void test(String[] input, Map<String, Integer> expected) {
        assertEquals(expected, new WordLen().wordLen(input));
    }

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.arguments(new String[]{"a", "bb", "a", "bb"}, Map.of("bb", 2, "a", 1)),
                Arguments.arguments(new String[]{"this", "and", "that", "and"}, Map.of("that", 4, "and", 3, "this", 4)),
                Arguments.arguments(new String[]{"code", "code", "code", "bug"}, Map.of("code", 4, "bug", 3))
        );
    }

}