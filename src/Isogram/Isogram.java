package Isogram;

import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static void main(String[] args) {
    }

    public static boolean isIsogram(String str) {
        // an empty string is isogram
        if (str.equals("")) {
            return true;
        }

        // using "set"
        Set<Character> uniqueLetters = new HashSet<>(str.length());
        // we should ignore capital symbols
        for (Character c : str.toCharArray()) {
            if (c >= 65 && c <= 90) {
                uniqueLetters.add((char) (c + 32));
            }
            else {
                uniqueLetters.add(c);
            }
        }
        return uniqueLetters.size() == str.length();
    }
}

/*
* Best practices
*   #1
*   public static boolean isIsogram(String str) {
        return str.length() == str.toLowerCase().chars().distinct().count();
    }
*
*   #2
*   import java.util.regex.Pattern;
    public static boolean  isIsogram(String str) {
        return !Pattern.compile("(?i)\\b\\w*(\\w)\\w*(?=\\1)\\w*\\b").matcher(str).matches();
    }
*/
