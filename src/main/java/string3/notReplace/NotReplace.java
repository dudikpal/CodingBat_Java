package string3.notReplace;

public class NotReplace {

    public String notReplace(String str) {

        return str.replaceAll("(?<![a-zA-Z])is(?![a-zA-Z])", "is not");
    }

}
