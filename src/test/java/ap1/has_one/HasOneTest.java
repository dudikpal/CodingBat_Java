package ap1.has_one;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class HasOneTest {

    @ParameterizedTest
    @MethodSource("params")
    void test(int input, boolean expected) {
        assertEquals(expected, new HasOne().hasOne(input));
    }

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.arguments(10, true),
                Arguments.arguments(22, false),
                Arguments.arguments(220, false)
        );
    }
}