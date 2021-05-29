package array2.sum28;

public class Sum28 {

    public boolean sum28(int[] nums) {

        int sum = 0;
        for (int number : nums) {
            if (number == 2) {
                sum += 2;
            }
        }
        return sum == 8;
    }

}
