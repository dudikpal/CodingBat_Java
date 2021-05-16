package string2.counthi;

public class CountHi {

    public int countHi(String str) {

        int indexOfHi = str.indexOf("hi");
        int counter = 0;
        while (indexOfHi != -1) {
            counter++;
            str = str.substring(indexOfHi + 2);
            indexOfHi = str.indexOf("hi");
        }
        return counter;
    }
}
