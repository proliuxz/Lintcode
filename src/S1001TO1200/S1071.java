package S1001TO1200;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class S1071 {
    public String longestWord(String[] words) {
        Set<String> set = new HashSet();
        for (String word: words) set.add(word);
        Arrays.sort(words, (a, b) -> a.length() == b.length()
                ? a.compareTo(b) : b.length() - a.length());
        for (String word: words) {
            boolean flag = true;
            for (int k = 1; k < word.length(); ++k) {
                if (!set.contains(word.substring(0, k))) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                return word;
        }
        return new String();
    }
}
