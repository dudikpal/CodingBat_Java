Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array.

wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}

Codingbat Solution

```java
public Map<String, Boolean> wordMultiple(String[] strings) {
  Map<String, Boolean> map = new HashMap();
  for (String s:strings) {
    // plan for stored boolean:
    //   false = seen it once
    //   true = seen it twice or more
    if (!map.containsKey(s)) {
      map.put(s, false);
    }
    else if (map.get(s) == false) {  // works without this test
      map.put(s, true);
    }
  }
  return map;
}
```