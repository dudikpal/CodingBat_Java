package array2.only14;

public class Only14 {

    public boolean only14(int[] nums) {

        for (int number : nums) {
            if (number != 1 && number != 4) {
                return false;
            }
        }
        return true;
    }

}
