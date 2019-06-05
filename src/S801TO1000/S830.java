package S801TO1000;

import java.util.Arrays;

public class S830 {
    public String stringSort(String str) {
        // Write your code here
        int[] dic = new int[26];
        char[] chars = str.toCharArray();
        for(char c : chars)
        {
            dic[c-'a']++;
        }
        Pair[] pair = new Pair[str.length()];
        for (int i = 0; i < str.length(); i++) {
            pair[i] = new Pair();
            pair[i].cnt = dic[(int)str.charAt(i) - (int)('a')];
            pair[i].order = (int)str.charAt(i);
        }
        Arrays.sort(pair, (Pair p1, Pair p2) ->
            p1.cnt != p2.cnt ? p2.cnt - p1.cnt : p1.order - p2.order
        );
        char[] chr = new char[pair.length];
        for (int i = 0; i < pair.length; i++) {
            chr[i] = (char)pair[i].order;
        }
        return String.valueOf(chr);
    }
}

class Pair {
    int cnt, order;
}