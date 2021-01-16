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
    }
}
