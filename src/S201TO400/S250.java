package S201TO400;

import java.util.*;

public class S250 {
    public boolean ispalindrome(List<String> ambigram, String word) {
        Map<Character, Set<Character>> map = new HashMap<>();
        for (String amb: ambigram) {
            Set<Character> dic = map.getOrDefault(amb.charAt(1), new HashSet<>());
            Set<Character> dic2 = map.getOrDefault(amb.charAt(0), new HashSet<>());
            dic.add(amb.charAt(0));
            dic2.add(amb.charAt(1));
            map.put(amb.charAt(1), dic);
            map.put(amb.charAt(0), dic2);
        }
        int len = word.length();
        for (int i = 0; i < len >> 1; i++) {
            char l = word.charAt(i);
            char r = word.charAt(len - 1 - i);
            if (l == r)
                continue;
            if (!map.containsKey(r) || !map.containsKey(l))
                return false;
            Set<Character> ls = new HashSet<>(map.get(l));
            Set<Character> rs = new HashSet<>(map.get(r));
            if (ls.contains(r) || rs.contains(l))
                continue;
            ls.retainAll(rs);
            if (ls.size() == 0)
                return false;
        }
        return true;
    }
}
