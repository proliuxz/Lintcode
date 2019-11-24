package S601TO800;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class S671 {
    public int countRotateWords(List<String> words) {
        // Write your code here
        Set<String> set = new HashSet<>();
        for (String word: words
             ) {
            String s = word + word;
            for (int i = 1; i < word.length(); i++) {
                set.remove(s.substring(i, i + word.length()));
            }
            set.add(word);
        }
        return set.size();
    }
}
