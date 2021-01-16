package warmup1;

public class StartOz {
    public String startOz(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.length() < 2) {
            return str.charAt(0) == 'o' ? "o" : "";
        }
        return oOrZ(str);
    }

    private String oOrZ(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0) == 'o' ? "o" : "");
        sb.append(str.charAt(1) == 'z' ? "z" : "");
        return sb.toString();
    }
}
