package S601TO800;

import java.util.*;

public class S648 {
    HashMap<String, Set<String>> map = new HashMap<>();
    public S648(String[] dictionary) {
        for (String s: dictionary
             ) {
            String abbr = GetAbbr(s);
            Set<String> cur = map.getOrDefault(abbr, new HashSet<>());
            cur.add(s);
            map.put(abbr, cur);
        }
    }

    public boolean isUnique(String word) {
        String abbr = GetAbbr(word);
        if (!map.containsKey(abbr))
            return true;
        Set cur = map.get(abbr);
        if (cur.size() != 1)
            return false;
        return cur.contains(word);
    }

    private String GetAbbr(String s)
    {
        if (s.length() < 3)
            return s;
        else
            return "" + s.charAt(0) + (s.length() - 2) + s.charAt(s.length() - 1);
    }

    public static void main(String[] args)
    {
        S648 s = new S648(new String[] {"deer","door","cake","card"});
        s.isUnique("dear");
        s.isUnique("cart");
        s.isUnique("cane");
        s.isUnique("make");
    }
}
