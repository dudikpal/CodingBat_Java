package array2.lucky13;

public class Lucky13 {

    public boolean lucky13(int[] nums) {

        for (int number : nums) {
            if (number == 1 || number == 3) {
                return false;
            }
        }
        return true;
    }

}
