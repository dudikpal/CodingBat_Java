package array2.havethree;

public class HaveThree {

    public boolean haveThree(int[] nums) {

        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                counter++;
                if (i < nums.length - 1 && nums[i + 1] == 3) {
                    return  false;
                }
            }
        }
        return counter == 3;
    }

}
