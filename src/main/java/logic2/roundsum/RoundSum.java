package logic2.roundsum;

public class RoundSum {

    public int roundSum(int a, int b, int c) {

        int sum = 0;
        sum += round10(a);
        sum += round10(b);
        sum += round10(c);
        return sum;
    }

    private int round10(int number) {
        if (number % 10 > 4) {
            return number - number % 10 + 10;
        } else {
            return number - number % 10;
        }
    }

}
