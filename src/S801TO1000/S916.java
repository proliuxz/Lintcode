package S801TO1000;

import java.util.HashSet;
import java.util.Set;

public class S916 {
    public boolean canPermutePalindrome(String s) {
        // write your code here
        Set<Character> set = new HashSet<>();
        for(Character c : s.toCharArray())
        {
            if (set.contains(c))
                set.remove(c);
            else
                set.add(c);
        }
        return set.size() < 2;
    }
}
