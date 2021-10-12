package ap1.copy_evens;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CopyEvensTest {

    @ParameterizedTest
    @MethodSource("params")
    void test(int[] input, int count, int[] expected) {
        assertArrayEquals(expected, new CopyEvens().copyEvens(input, count));
    }

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.arguments(new int[]{3, 2, 4, 5, 8}, 2, new int[]{2, 4}),
                Arguments.arguments(new int[]{3, 2, 4, 5, 8}, 3, new int[]{2, 4, 8}),
                Arguments.arguments(new int[]{6, 1, 2, 4, 5, 8}, 3, new int[]{6, 2, 4})
        );
    }

}