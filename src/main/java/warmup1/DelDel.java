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

/*
Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.

delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
 */