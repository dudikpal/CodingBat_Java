package string3.notReplace;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NotReplaceTest {

    @ParameterizedTest
    @MethodSource("params")
    void test(String input, String expected) {

        assertEquals(expected, new NotReplace().notReplace(input));
    }

    static Stream<Arguments> params() {

        return Stream.of(
                Arguments.arguments("is test", "is not test"),
                Arguments.arguments("is-is", "is not-is not"),
                Arguments.arguments("This is right", "This is not right")
        );
    }

}