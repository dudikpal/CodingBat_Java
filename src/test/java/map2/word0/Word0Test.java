package map2.word0;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Word0Test {

    @ParameterizedTest
    @MethodSource("params")
    void test(String[] input, Map<String, Integer> expected) {
        //assertEquals(expected, new Word0().word0(input));
        assertTrue(expected.equals(new Word0().word0(input)));
    }

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.arguments(new String[]{"a", "b", "a", "b"}, Map.of("a", 0, "b", 0)),
                Arguments.arguments(new String[]{"a", "b", "a", "c", "b"}, Map.of("a", 0, "b", 0, "c", 0)),
                Arguments.arguments(new String[]{"c", "b", "a"}, Map.of("a", 0, "b", 0, "c", 0))
        );
    }

}