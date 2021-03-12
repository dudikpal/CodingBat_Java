package warmup1;

public class HasTeen {
    public boolean hasTeen(int a, int b, int c) {
        return isTeen(a, b, c);
    }

    private boolean isTeen(int a, int b, int c) {
        if (a > 12 && a < 20) {
            return true;
        }
        if (b > 12 && b < 20) {
            return true;
        }
        if (c > 12 && c < 20) {
            return true;
        }
        return false;
        /*
        return (a>=13 && a<=19) ||
         (b>=13 && b<=19) ||
         (c>=13 && c<=19);
         */
    }
}


/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.

hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 10, 13) → true
 */