package array2.has77;

public class Has77 {

    public boolean has77(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 7) {
                if (nums[i + 1] == 7) {
                    return true;
                }
                if (i < nums.length - 2 && (nums[i + 1] == 7 || nums[i + 2] == 7)) {
                    return true;
                }
            }
        }
        return false;
    }

}
