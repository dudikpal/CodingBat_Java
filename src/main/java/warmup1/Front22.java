package warmup1;

public class Front22 {
    public String front22(String str) {
        if (str.length() < 2) {
            return new StringBuilder().append(str).append(str).append(str).toString();
        }
        String firstChars = str.substring(0, 2);
        return new StringBuilder().append(str).insert(0, firstChars).append(firstChars).toString();

    }
}
