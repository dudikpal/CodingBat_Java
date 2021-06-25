package logic2.makechocolate;

public class MakeChocolate {

    public int makeChocolate(int small, int big, int goal) {

        if (small + big * 5 < goal) {
            return -1;
        }
        for (int i = 0; i < big; i++) {
            if (goal / 5 == 0) {
                break;
            }
            goal -= 5;
        }
        if (goal > small) {
            return -1;
        }
        return goal;
    }

}
