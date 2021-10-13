package ap1.divides_self;

public class DividesSelf {

    public boolean dividesSelf(int n) {

        int divider = 10;
        while (divider / 10 < n) {
            if (n % divider == 0 || n % ((n % divider) / (divider / 10)) != 0) {
                return false;
            }
            divider *= 10;
        }
        return true;
    }

}
