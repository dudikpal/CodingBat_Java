package warmup2.countxx;

public class CountXX {
    
    int countXX(String str) {
    
        if (str.length() == 0) {
            return 0;
        }
        if (str.startsWith("xx")) {
            return 1 + countXX(str.substring(1));
        }
        return countXX(str.substring(1));
    
    }
}
