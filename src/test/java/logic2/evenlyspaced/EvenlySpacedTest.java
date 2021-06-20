package logic2.evenlyspaced;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

class EvenlySpacedTest {

    @ParameterizedTest
    @MethodSource("evenlySpacedInputs")
    void test(int a, int b, int c, boolean isEvenlySpaced) {
        assertEquals(isEvenlySpaced, new EvenlySpaced().evenlySpaced(a, b, c));
    }

    static Stream<Arguments> evenlySpacedInputs() {
        return Stream.of(
                Arguments.arguments(2, 4, 6, true),
                Arguments.arguments(4, 6, 2, true),
                Arguments.arguments(4, 6, 3, false),
                Arguments.arguments(3, 6, 12, false),
                Arguments.arguments(9, 10, 11, true)
        );
    }

}