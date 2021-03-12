package warmup1;

public class Max1020 {
    public int max1020(int a, int b) {
        int bigger, smaller;
        if (a > b) {
            bigger = a;
            smaller = b;
        } else {
            bigger = b;
            smaller = a;
        }
        return bigger >= 10 && bigger <= 20 ? bigger : smaller >= 10 && smaller <= 20 ? smaller : 0;
    }
}

/*
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.

max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
 */