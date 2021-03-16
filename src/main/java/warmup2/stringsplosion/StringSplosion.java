package warmup2.stringsplosion;

public class StringSplosion {
    
    public String stringSplosion(String str) {
    
        if (str.length() == 0) {
            return str;
        }
        return stringSplosion(str.substring(0, str.length() - 1)) + str;
    }
}
