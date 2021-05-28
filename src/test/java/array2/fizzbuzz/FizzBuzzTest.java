package array2.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void test() {
        int inputStart = 1;
        int inputEnd = 11;
        String[] expected = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"};
        assertArrayEquals(expected, new FizzBuzz().fizzBuzz(inputStart, inputEnd));
    }

    @Test
    void test2() {
        int inputStart = 50;
        int inputEnd = 56;
        String[] expected = {"Buzz", "Fizz", "52", "53", "Fizz", "Buzz"};
        assertArrayEquals(expected, new FizzBuzz().fizzBuzz(inputStart, inputEnd));
    }

}