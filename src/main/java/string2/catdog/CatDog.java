package string2.catdog;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CatDog {

    public boolean catDog(String str) {

        Pattern pCat = Pattern.compile("cat");
        Pattern pDog = Pattern.compile("(?=(dog))");
        Matcher mCat = pCat.matcher(str);
        Matcher mDog = pDog.matcher(str);
        int catCounter = 0;
        while (mCat.find()) {
            catCounter++;
        }
        int dogCounter = 0;
        while (mDog.find()) {
            dogCounter++;
        }
        return catCounter == dogCounter;
    }

}
