package array2.fizzbuzz;

public class FizzBuzz {

    public String[] fizzBuzz(int start, int end) {

        int index = 0;
        String[] result = new String[end - start];
        for (int i = start; i < end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result[index] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[index] = "Fizz";
            } else if (i % 5 == 0) {
                result[index] = "Buzz";
            } else {
                result[index] = String.valueOf(i);
            }
            index++;
        }
        return result;
    }

}
