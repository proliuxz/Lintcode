package S1001TO1200;

import java.util.*;

public class S1190 {
    public String findLongestWord(String s, List<String> d) {
        // write your code  here
        Collections.sort(d, (String a, String b) -> a.length() == b.length() ? a.compareTo(b) : a.length() - b.length());
        for(String word : d)
        {
            if (match(s, word))
                return word;
        }
        return new String();
    }

    private boolean match(String s, String word)
    {
        int i = 0;
        int j = 0;
        for (; i < s.length() && j < word.length() && s.length() - i >= word.length() - j; i++) {
            if (s.charAt(i) == word.charAt(j)) {
                j++;
            }
        }
        return j == word.length();
    }
}
