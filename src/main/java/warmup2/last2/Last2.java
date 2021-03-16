package warmup2.last2;

public class Last2 {
    
    public int last2(String str) {
    
        if (str.length() < 3) {
            return 0;
        }
        if (str.startsWith(str.substring(str.length() - 2))) {
            return 1 + last2(str.substring(1));
        }
        return last2(str.substring(1));
    }
}
