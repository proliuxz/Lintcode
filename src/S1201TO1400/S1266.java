package S1201TO1400;

import java.util.HashMap;
import java.util.Map;

public class S1266 {
    public char findTheDifference(String s, String t) {
        // Write your code here
        Map<Character, Integer> alphabet = new HashMap<>();
        for(char c : t.toCharArray())
            alphabet.put(c, alphabet.getOrDefault(c, 0) + 1);
        for(char c : s.toCharArray())
        {
            int res = alphabet.get(c) - 1;
            if (res > 0)
                alphabet.put(c, res);
            else
                alphabet.remove(c);
        }
        for (char res : alphabet.keySet())
        {
            return res;
        }
        return 'a';
    }
}
