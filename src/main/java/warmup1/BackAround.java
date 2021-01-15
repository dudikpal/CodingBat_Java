package warmup1;

public class BackAround {
    public String backAround(String str) {
        String lastLetter = String.valueOf(str.charAt(str.length() - 1));
        return new StringBuilder().append(str).insert(0, lastLetter).append(lastLetter).toString();
    }
}
