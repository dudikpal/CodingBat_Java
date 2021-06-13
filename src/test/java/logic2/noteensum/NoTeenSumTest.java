package logic2.noteensum;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class NoTeenSumTest {

    @Test
    void without_teen_number() {
        int inputA = 1;
        int inputB = 13;
        int inputC = 3;
        int expected = 4;
        assertEquals(expected, new NoTeenSum().noTeenSum(inputA, inputB, inputC));
    }

    @Test
    void with_teen_number() {
        int inputA = 15;
        int inputB = 14;
        int inputC = 20;
        int expected = 35;
        assertEquals(expected, new NoTeenSum().noTeenSum(inputA, inputB, inputC));
    }

}