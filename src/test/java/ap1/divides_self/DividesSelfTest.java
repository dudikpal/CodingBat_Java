package ap1.divides_self;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DividesSelfTest {

    @ParameterizedTest
    @MethodSource("params")
    void test(int input, boolean expected) {
        assertEquals(expected, new DividesSelf().dividesSelf(input));
    }

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.arguments(128, true),
                Arguments.arguments(12, true),
                Arguments.arguments(120, false),
                Arguments.arguments(32, false)
        );
    }
}