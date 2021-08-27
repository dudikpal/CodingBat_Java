package map2.firstchar;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FirstCharTest {

    @ParameterizedTest
    @MethodSource("params")
    void test(String[] input, Map<String, String> expected) {
        assertEquals(expected, new FirstChar().firstChar(input));
    }

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.arguments(new String[]{"salt", "tea", "soda", "toast"}, Map.of("s", "saltsoda", "t", "teatoast")),
                Arguments.arguments(new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"}, Map.of("a", "aaaAA", "b", "bb", "c", "cccCC", "d", "d")),
                Arguments.arguments(new String[]{}, Map.of())
        );
    }

}