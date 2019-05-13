package S001TO200;

import java.util.ArrayList;
import java.util.List;

public class S133 {
    public List<String> longestWords(String[] dictionary) {
        // write your code here
        List<String> result = new ArrayList<>();
        if (dictionary == null || dictionary.length == 0)
            return result;

        int len = 0;
        for (int i = 0; i < dictionary.length ; i++) {
            String word = dictionary[i];
            int wordLen = word.length();
            if (wordLen > len)
            {
                result.clear();
                result.add(word);
                len = wordLen;
            }
            else if (wordLen == len)
                result.add(word);
        }
        return result;
    }
}
