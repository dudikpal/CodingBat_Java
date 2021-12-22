package string3.countYZ;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CountYZTest {

    @ParameterizedTest
    @MethodSource("params")
    void countZYtest(String input, int expected) {
        assertTrue(expected == new CountYZ().countYZ(input));
    }

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.arguments("fez day", 2),
                Arguments.arguments("day fez", 2),
                Arguments.arguments("day fyyyz", 2)
        );
    }

}