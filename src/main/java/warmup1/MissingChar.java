package warmup1;

public class MissingChar {

    public String missingChar(String str, int n) {
        return new StringBuilder().append(str).replace(n, n + 1, "").toString();
    }
}
