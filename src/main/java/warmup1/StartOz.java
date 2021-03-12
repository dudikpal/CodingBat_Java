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

/*
Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
 */