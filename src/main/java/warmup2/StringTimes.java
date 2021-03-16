package warmup2;

public class StringTimes {
    
    public String stringTimes(String str, int n) {
       // CodingBat dont recognize
       // return str.repeat(n);
       if (n == 0) {
           return "";
       }
       return str + stringTimes(str, n - 1);
    }
}

/*
Solution:

public String stringTimes(String str, int n) {
  String result = "";
  for (int i=0; i<n; i++) {
    result = result + str;  // could use += here
  }
  return result;
}
 */