package warmup2.doublex;

public class DoubleX {
    
    boolean doubleX(String str) {
     
        if (str.length() == 0) {
            return false;
        }
        if (str.startsWith("x")) {
            return str.startsWith("xx");
        }
        return doubleX(str.substring(1));
    }
}
