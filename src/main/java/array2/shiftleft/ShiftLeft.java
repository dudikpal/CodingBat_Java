package array2.shiftleft;

public class ShiftLeft {

    public int[] shiftLeft(int[] nums) {

        if (nums.length < 2) {
            return nums;
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length - 1; i++) {
            result[i] = nums[i + 1];
        }
        result[result.length - 1] = nums[0];
        return result;
    }

}
