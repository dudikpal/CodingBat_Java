package array2.sum67;

public class Sum67 {

    public int sum67(int[] nums) {

        boolean ignore = false;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                ignore = true;
            } else if (!ignore) {
                sum += nums[i];
            } else if (nums[i] == 7) {
                ignore = false;
            }

        }
        return sum;
    }

}
