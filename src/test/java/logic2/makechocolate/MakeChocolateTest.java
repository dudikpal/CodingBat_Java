package logic2.makechocolate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class MakeChocolateTest {

    @ParameterizedTest(name = "int[]({0}, {1}, {2}) -> {3}")
    @MethodSource("makeChocArgs")
    void test_Make_Choc(int a, int b, int c, int expected) {
        assertEquals(expected, new MakeChocolate().makeChocolate(a, b, c));
    }

    static Stream<Arguments> makeChocArgs() {
        return Stream.of(
                Arguments.arguments(4, 1, 9, 4),
                Arguments.arguments(4, 1, 10, -1),
                Arguments.arguments(4, 1, 7, 2),
                Arguments.arguments(6, 2, 7, 2),
                Arguments.arguments(6, 1, 10, 5)
        );
    }

}