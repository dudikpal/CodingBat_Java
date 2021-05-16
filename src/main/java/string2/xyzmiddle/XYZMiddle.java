package string2.xyzmiddle;

public class XYZMiddle {

    public boolean xyzMiddle(String str) {

        if (str.length() < 3) {
            return false;
        }
        int middleIndex = str.length() / 2;
        if (str.length() % 2 == 0) {
            return str.substring(middleIndex - 1, middleIndex + 2).equals("xyz")
                    || str.substring(middleIndex - 2, middleIndex + 1).equals("xyz");
        }
        return str.substring(middleIndex - 1, middleIndex + 2).equals("xyz");

    }

}
