package warmup1;

public class NotString {
    public String notString(String str) {
        return str.length() < 3 || !str.startsWith("not") ? "not " + str : str;
    }

}
