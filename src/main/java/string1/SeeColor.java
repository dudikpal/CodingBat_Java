package string1;

public class SeeColor {
    public String seeColor(String str) {
        if (str.length() < 3) {
            return "";
        } else if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        } else {
            return "";
        }

    }

}
