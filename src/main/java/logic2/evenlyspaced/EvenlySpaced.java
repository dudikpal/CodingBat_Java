package logic2.evenlyspaced;

public class EvenlySpaced {

    public boolean evenlySpaced(int a, int b, int c) {

        int middle = (a + b + c) / 3;
        if (middle != a && middle != b && middle != c) {
            return false;
        }
        int max;
        int min;
        if (middle == a) {
            max = Math.max(b, c);
            min = Math.min(b, c);
        } else if (middle == b){
            max = Math.max(a, c);
            min = Math.min(a, c);
        } else {
            max = Math.max(a, b);
            min = Math.min(a, b);
        }
        return middle - min == max - middle;
    }

}
