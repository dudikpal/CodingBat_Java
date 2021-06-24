package logic2.closefar;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class CloseFarTest {

    @ParameterizedTest(name = "int ({0}, {1}, {2}) -> {3}")
    @MethodSource("cases")
    void test_Close_Far(int a, int b, int c, boolean expected) {

        assertEquals(expected, new CloseFar().closeFar(a, b, c));
    }

    private static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.arguments(1, 2, 10, true),
                Arguments.arguments(1, 2, 3, false),
                Arguments.arguments(4, 1, 3, true),
                Arguments.arguments(10, 10, 8, true)
        );
    }
}