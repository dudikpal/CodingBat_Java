package warmup1;

public class Front3 {

    public String front3(String str) {
        if (str.length() < 3) {
            return new StringBuilder().append(str).append(str).append(str).toString();
        }
        String front3 = str.substring(0, 3);
        return new StringBuilder().append(front3).append(front3).append(front3).toString();
    }
}
