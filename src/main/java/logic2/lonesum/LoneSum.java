package logic2.lonesum;

public class LoneSum {

    public int loneSum(int a, int b, int c) {

        if (a == b && a == c) {
            return 0;
        } else if (a == b) {
            return c;
        } else if (a == c) {
            return b;
        } else if (b == c) {
            return a;
        } else {
            return a + b + c;
        }

        /*
        int sum = 0;
        if (a != b && a != c) {
        sum += a;
        }
        if (b != a && b != c) {
        sum += b;
        }
        if (c != a && c != b) {
        sum += c;
        }
return sum;
         */
    }

}
