package string3.sum_numbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SumNumbersTest {


    @ParameterizedTest
    @MethodSource("params")
    void test(String input, int expected) {

        assertEquals(expected, new SumNumbers().sumNumbers(input));
    }

    static Stream<Arguments> params() {

        return Stream.of(
                Arguments.arguments("abc123xyz", 123),
                Arguments.arguments("abc11xy33z", 44),
                Arguments.arguments("7 11", 18)
        );
    }

}