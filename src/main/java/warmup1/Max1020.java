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
