package string2.xybalance;

public class XYBalance {

    public boolean xyBalance(String str) {

        int xFirstIndex = str.indexOf('x');
        int xLastIndex = str.lastIndexOf('x');
        if (!str.contains("x")) {
            return true;
        }
        if (str.substring(xLastIndex).contains("y")) {
            return true;
        }
        return false;
    }
}
