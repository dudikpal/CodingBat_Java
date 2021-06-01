package array2.tenrun;

public class TenRun {

    public int[] tenRun(int[] nums) {
        int actual = 0;
        boolean wasTenTimes = false;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 10 == 0) {
                actual = nums[i];
                wasTenTimes = true;
            }
            if (wasTenTimes) {
                nums[i] = actual;
            }

        }
        return nums;
    }

}
