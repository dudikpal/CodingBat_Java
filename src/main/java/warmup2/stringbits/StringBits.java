package warmup2.stringbits;

public class StringBits {
    
    public String stringBits(String str) {
    
        if (str.length() < 2) {
            return str;
        }
        return str.charAt(0) + stringBits(str.substring(2));
    }
}
