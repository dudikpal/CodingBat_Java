package array2.sum13;

public class Sum13 {

    public int sum13(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
                continue;
            }
            sum += nums[i];
        }
        return sum;
    }

}
