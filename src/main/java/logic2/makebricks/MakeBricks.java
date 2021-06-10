package logic2.makebricks;

public class MakeBricks {

    public boolean makeBricks(int small, int big, int goal) {

        final int SMALL = 1;
        final int BIG = 5;
        if (small * SMALL + big * BIG < goal
            || (goal / BIG > big && goal % BIG > small)
            || (goal % BIG > small)) {
            return false;
        }
        return true;
    }

}
