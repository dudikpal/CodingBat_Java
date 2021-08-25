package map2.word_multiple;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.Map;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

class WordMultipleTest {

    @ParameterizedTest
    @MethodSource("params")
    void test(String[] input, Map<String, Boolean> expected) {
        assertEquals(expected, new WordMultiple().wordMultiple(input));
    }

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.arguments(new String[] {"a", "b", "a", "c", "b"}, Map.of("a", true, "b", true, "c", false)),
                Arguments.arguments(new String[] {"c", "b", "a"}, Map.of("a", false, "b", false, "c", false)),
                Arguments.arguments(new String[] {"c", "c", "c", "c"}, Map.of("c", true))
        );
    }

}