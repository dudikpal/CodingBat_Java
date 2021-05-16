package string2.endother;

public class EndOther {

    public boolean endOther(String a, String b) {

        String shorter, longer;
        if (a.length() < b.length()) {
            shorter = a;
            longer = b;
        } else {
            shorter = b;
            longer = a;
        }
        return longer.toLowerCase().substring(longer.length() - shorter.length()).equals(shorter.toLowerCase());
    }

}
