package string1;

public class HasBad {
    public boolean hasBad(String str) {
        if (str.length() < 4) {
            return str.startsWith("bad");
        }
        return str.startsWith("bad") || str.substring(1).startsWith("bad");
    }

}
