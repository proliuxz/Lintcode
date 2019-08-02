package S1401TO1600;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class S1592 {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        // Write your code here.
        List<String> res = new ArrayList<>();
        if (words == null || words.length == 0)
            return res;
        String p = calcPattern(pattern);
        for (String word: words
             ) {
            if (p.equals(calcPattern(word)))
                res.add(word);
        }
        return res;
    }

    private String calcPattern(String s)
    {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Character> map = new HashMap<>();
        for (char c: s.toCharArray()
             ) {
            if (map.containsKey(c))
                sb.append(map.get(c));
            else{
                char p = (char) ('a' + map.size());
                map.put(c, p);
                sb.append(p);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args)
    {
        S1592 s = new S1592();
        String str = s.calcPattern("bqq");
        System.out.println(s.calcPattern(str));
    }
}
