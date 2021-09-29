package map2.pairs;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PairsTest {

    @ParameterizedTest
    @MethodSource("params")
    void test(String[] input, Map<String, String> expected) {

        assertEquals(expected, new Pairs().pairs(input));
    }

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.arguments(new String[]{"code", "bug"}, Map.of("b", "g", "c", "e")),
                Arguments.arguments(new String[]{"man", "moon", "main"}, Map.of("m","n")),
                Arguments.arguments(new String[]{"man", "moon", "good", "night"}, Map.of("g", "d", "m", "n", "n", "t"))
        );
    }

}