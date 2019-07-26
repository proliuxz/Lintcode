package S1001TO1200;

import java.util.HashSet;
import java.util.Set;

public class S1038 {
    public int numJewelsInStones(String J, String S) {
        // Write your code here
        int res = 0;
        if (J == null || S == null || J.length() == 0 || S.length() == 0)
            return 0;
        Set<Character> set = new HashSet<>();
        for (char j: J.toCharArray())
            set.add(j);

        for (char s: S.toCharArray())
            if (set.contains(s))
                res++;
        return res;
    }
}
