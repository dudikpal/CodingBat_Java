package string2.getsandwich;

public class GetSandwich {

    public String getSandwich(String str) {

        int indexOfBreadFirst = str.indexOf("bread");
        int indexOfBreadLast = str.lastIndexOf("bread");
        if (indexOfBreadFirst == indexOfBreadLast
                || indexOfBreadFirst == -1) {
            return "";
        }
        return str.substring(indexOfBreadFirst + 5, indexOfBreadLast);
    }

}
