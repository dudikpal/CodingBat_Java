package array2.withoutten;

public class WithoutTen {

    public int[] withoutTen(int[] nums) {

        int[] result = new int[nums.length];
        int resultIndex = 0;
        for (int number : nums) {
            if (number != 10) {
                result[resultIndex] = number;
                resultIndex++;
            }
        }
        return result;
    }

}
