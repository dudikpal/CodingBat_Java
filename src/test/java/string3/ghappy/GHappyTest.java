package string3.ghappy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;


class GHappyTest {

    @ParameterizedTest
    @MethodSource("params")
    void test(String input, boolean expected) {

        assertEquals(expected, new GHappy().gHappy(input));
    }


    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.arguments("xxggxx", true),
                Arguments.arguments("xxgxx", false),
                Arguments.arguments("xxggyygxx", false)
        );
    }

}