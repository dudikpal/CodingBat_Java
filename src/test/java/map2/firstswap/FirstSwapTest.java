package map2.firstswap;


import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FirstSwapTest {

    @ParameterizedTest
    @MethodSource("params")
    void test(String[] input, String[] expected) {
        assertArrayEquals(expected, new FirstSwap().firstSwap(input));
    }

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.arguments(new String[]{"ab", "ac"}, new String[]{"ac", "ab"}),
                Arguments.arguments(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"}, new String[]{"ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"}),
                Arguments.arguments(new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"}, new String[]{"ay", "by", "ax", "bx", "ai", "aj", "bx", "by"})
        );
    }

}