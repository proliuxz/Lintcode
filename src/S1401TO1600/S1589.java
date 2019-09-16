package S1401TO1600;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class S1589 {
    public int numSpecialEquivGroups(String[] A) {
        // write your code here
        Set<String> s = new HashSet();
        for (String str: A) {
            int[] count = new int[52];
            for (int i = 0; i < str.length(); ++i)
                count[str.charAt(i) - 'a' + 26 * (i % 2)]++;
            s.add(Arrays.toString(count));
        }
        return s.size();
    }
}
