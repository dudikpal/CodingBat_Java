package warmup1;

public class DelDel {
    public String delDel(String str) {
        if (str.length() < 4) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        return sb.substring(1, 4).equals("del") ? sb.replace(1, 4, "").toString() : sb.toString();
    }

}
