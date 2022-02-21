package string3.without_string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class WithoutStringTest {


    @ParameterizedTest
    @MethodSource("params")
    void test(String input, String remove, String expected) {

        assertEquals(expected, new WithoutString().withoutString(input, remove));
    }

    static Stream<Arguments> params() {

        return Stream.of(
                Arguments.arguments("Hello there", "llo", "He there"),
                Arguments.arguments("Hello there", "e", "Hllo thr"),
                Arguments.arguments("Hello there", "x", "Hello there")
        );
    }

}