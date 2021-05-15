package string2.repeatend;

public class RepeatEnd {

    public String solution(String str, int n) {
        return str.substring(str.length() - n).repeat(n);
    }
}
