package array2.countevens;

public class CountEvens {

    public int countEvens(int[] nums) {

        int counter = 0;
        for (int number : nums) {
            if (number % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

}
