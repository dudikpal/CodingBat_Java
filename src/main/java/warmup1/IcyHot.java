package warmup1;

public class IcyHot {
    public boolean icyHot(int temp1, int temp2) {
        boolean lessThanZero = temp1 < 0 || temp2 < 0;
        boolean greaterThan100 = temp1 > 100 || temp2 > 100;
        return lessThanZero && greaterThan100;
    }
}
