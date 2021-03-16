package warmup2.fronttimes;

public class FrontTimes {
    
    public String frontTimes(String str, int n) {
    
        if (n < 1) {
            return "";
        }
        if (str.length() < 4) {
            return str + frontTimes(str, n - 1);
        }
        return str.substring(0, 3) + frontTimes(str.substring(0, 3), n - 1);
    }
}

/*
CodingBat Solution:

public String frontTimes(String str, int n) {
  int frontLen = 3;
  if (frontLen > str.length()) {
    frontLen = str.length();
  }
  String front = str.substring(0, frontLen);
  
  String result = "";
  for (int i=0; i<n; i++) {
    result = result + front;
  }
  return result;
}
 */