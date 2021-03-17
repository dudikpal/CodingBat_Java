package warmup2.stringyak;

public class StringYak {
    
    public String stringYak(String str) {
    
        if (str.length() < 3) {
            return str;
        }
        if (str.charAt(0) == 'y' && str.charAt(2) == 'k') {
            return stringYak(str.substring(3));
        }
        return str.charAt(0) + stringYak(str.substring(1));
    }
}

/*
Solution:

public String stringYak(String str) {
  String result = "";
  
  for (int i=0; i<str.length(); i++) {
    // Look for i starting a "yak" -- advance i in that case
    if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
      i =  i + 2;
    } else { // Otherwise do the normal append
      result = result + str.charAt(i);
    }
  }
  
  return result;
}
 */